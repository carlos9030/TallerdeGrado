/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

import Dato.DFicha_Obra_Materiales;
import Dato.DStock;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CarlosPc
 */
public class NFicha_Obra_Materiales {
        private DFicha_Obra_Materiales datoFicha;
        private DStock datoStock;
        
    public NFicha_Obra_Materiales() {
    datoFicha= new DFicha_Obra_Materiales();
    datoStock= new DStock();
    }
    
    public void setFicha_Obra(int notarecepcion,int idmateriales,String unidad,int cantidad){
    datoFicha.setIdFicha_Obra_Materiales(datoFicha.getCount()+1);
    datoFicha.setNotaRecepcion_idNotaRecepcion(notarecepcion);
    datoFicha.setMateriales_IdMaterial(idmateriales);
    datoFicha.setUnidad(unidad);
    datoFicha.setCantidad(cantidad);
    datoFicha.GuardarFichaObraMateriales();
    }
    
    public DefaultTableModel ListaTablaTotal(){
        return datoFicha.MostrarTablaTotal();
    }
    
    
    public DefaultTableModel ListaTabla(){
        return datoFicha.MostrarTabla();
    }
    
    public void Modificar(int idnotaficha, int cant){
        
    datoFicha.modificar_Cantidad(idnotaficha, cant);
    }
    
    public LinkedList<DFicha_Obra_Materiales> buscarMaterial(int id){
          LinkedList<DFicha_Obra_Materiales> buscar = new LinkedList<>();
      return buscar=datoFicha.buscar(id);
    }
    
    public void peps(int idmaterial, int cantidad){
   boolean b=false;
    LinkedList<DFicha_Obra_Materiales> listaMateriales= new LinkedList<>();
    listaMateriales=buscarMaterial(idmaterial);
        if(listaMateriales.size()==0){
            JOptionPane.showMessageDialog(null,"No existe ese Material en el Inventario","Advertencia",JOptionPane.YES_OPTION);
        }
        if(listaMateriales.size()==1){
            if(listaMateriales.get(0).getCantidad()>cantidad){
                Modificar(listaMateriales.get(0).getIdFicha_Obra_Materiales(), listaMateriales.get(0).getCantidad()-cantidad);
            }else{
                JOptionPane.showMessageDialog(null,"La cantidad a Retirar es Mayor q la del Stock");
            }
        }else{
            if(listaMateriales.size()>1){
                LinkedList<Integer> listafichas=new LinkedList<>();
                LinkedList<Integer> listacantidadmenor=new LinkedList<>();
                int sumatoria=0;
                int i=0;
                while(i<listaMateriales.size()){
                    if(listaMateriales.get(i).getCantidad()>=cantidad && sumatoria==0){
                    Modificar(listaMateriales.get(i).getIdFicha_Obra_Materiales(),listaMateriales.get(i).getCantidad()-cantidad);
                    break;
                    }else{
                        if(listaMateriales.get(i).getCantidad()!=0 && cantidad>=sumatoria){
                        listafichas.addLast(listaMateriales.get(i).getIdFicha_Obra_Materiales());
                        listacantidadmenor.addLast(listaMateriales.get(i).getCantidad());
                        sumatoria=sumatoria+listaMateriales.get(i).getCantidad();
                        }
                    }
                    i++;
                }
                 if(sumatoria>=cantidad){
                               while(!listafichas.isEmpty() && cantidad!=0){
                                   int x=listacantidadmenor.getFirst();
                                   if(sumatoria>x){
                                       Modificar(listafichas.getFirst(),0);
                                       sumatoria=sumatoria-cantidad;
                                       cantidad=cantidad-x;
                                   }else{
                                       Modificar(listafichas.getFirst(), x-cantidad);
                                   }
                                   listafichas.removeFirst();
                                  listacantidadmenor.removeFirst();
                               }
                            }
            }
        }
    }
    
  
   
    
}
