/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;
/**
 *
 * @author CarlosPc
 */
public class VPrincipal extends javax.swing.JFrame {
VContratista contratista=new VContratista();
VEmpleado empleado = new VEmpleado();
VMateriales materiales = new VMateriales();
VNotaDevolucion notaDevolucion = new VNotaDevolucion();
VNotaPedido notaPedido = new VNotaPedido();
VNotaPrestamo notaPrestamo = new VNotaPrestamo();
VNotaSalida notaSalida = new VNotaSalida();
VObra obra = new VObra();
VProveedor proveedor= new VProveedor();
VRecepcionMateriales recepcionMateriales = new VRecepcionMateriales();
VUsuario usuarios=new VUsuario();
VInventario inventario =new VInventario();
    /**
     * Creates new form Principal
     */
    public VPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsuarios = new javax.swing.JMenu();
        menuObras = new javax.swing.JMenu();
        menuContratista = new javax.swing.JMenu();
        menuEmpleados = new javax.swing.JMenu();
        menuProveedores = new javax.swing.JMenu();
        menuMateriales = new javax.swing.JMenu();
        menuInventarios = new javax.swing.JMenu();
        menuPedidos = new javax.swing.JMenu();
        menuRecepciones = new javax.swing.JMenu();
        menuSalidaMateriales = new javax.swing.JMenu();
        menuPrestamoMateriales = new javax.swing.JMenu();
        menuNotaDevolucion = new javax.swing.JMenu();

        setTitle("Menu Principal");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\CarlosPc\\Documents\\NetBeansProjects\\TallerdeGrado\\src\\imagenes\\13346781_1104900856232848_5787797330981177991_n.png")); // NOI18N

        menuUsuarios.setText("Usuarios");
        menuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUsuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUsuarios);

        menuObras.setText("Obras");
        menuObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuObrasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuObras);

        menuContratista.setText("Contratista");
        menuContratista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuContratistaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuContratista);

        menuEmpleados.setText("Empleados");
        menuEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpleadosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmpleados);

        menuProveedores.setText("Proveedores");
        menuProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProveedoresMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuProveedores);

        menuMateriales.setText("Materiales");
        menuMateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMaterialesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuMateriales);

        menuInventarios.setText("Inventario");
        menuInventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInventariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInventarios);

        menuPedidos.setText("Pedidos");
        menuPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPedidosMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPedidos);

        menuRecepciones.setText("Recepciones");
        menuRecepciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuRecepcionesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuRecepciones);

        menuSalidaMateriales.setText("Salidas de Materiales");
        menuSalidaMateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalidaMaterialesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalidaMateriales);

        menuPrestamoMateriales.setText("Prestamo de Materiales");
        menuPrestamoMateriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPrestamoMaterialesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuPrestamoMateriales);

        menuNotaDevolucion.setText("Nota de Devolucion");
        menuNotaDevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuNotaDevolucionMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuNotaDevolucion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(865, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUsuariosMouseClicked
     usuarios.setVisible(true);
    }//GEN-LAST:event_menuUsuariosMouseClicked

    private void menuContratistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuContratistaMouseClicked
      contratista.setVisible(true);
    }//GEN-LAST:event_menuContratistaMouseClicked

    private void menuEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpleadosMouseClicked
        empleado.setVisible(true);
    }//GEN-LAST:event_menuEmpleadosMouseClicked

    private void menuMaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMaterialesMouseClicked
       materiales.setVisible(true);
    }//GEN-LAST:event_menuMaterialesMouseClicked

    private void menuObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuObrasMouseClicked
        obra.setVisible(true);
    }//GEN-LAST:event_menuObrasMouseClicked

    private void menuProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProveedoresMouseClicked
        proveedor.setVisible(true);
    }//GEN-LAST:event_menuProveedoresMouseClicked

    private void menuInventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventariosMouseClicked
        inventario.setVisible(true);
    }//GEN-LAST:event_menuInventariosMouseClicked

    private void menuPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPedidosMouseClicked
       notaPedido.setVisible(true);
    }//GEN-LAST:event_menuPedidosMouseClicked

    private void menuRecepcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuRecepcionesMouseClicked
        recepcionMateriales.setVisible(true);
    }//GEN-LAST:event_menuRecepcionesMouseClicked

    private void menuSalidaMaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalidaMaterialesMouseClicked
        notaSalida.setVisible(true);
    }//GEN-LAST:event_menuSalidaMaterialesMouseClicked

    private void menuPrestamoMaterialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrestamoMaterialesMouseClicked
        notaPrestamo.setVisible(true);
    }//GEN-LAST:event_menuPrestamoMaterialesMouseClicked

    private void menuNotaDevolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuNotaDevolucionMouseClicked
        notaDevolucion.setVisible(true);
        
    }//GEN-LAST:event_menuNotaDevolucionMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.setVisible(false);
        this.dispose();
         this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuContratista;
    public javax.swing.JMenu menuEmpleados;
    public javax.swing.JMenu menuInventarios;
    public javax.swing.JMenu menuMateriales;
    private javax.swing.JMenu menuNotaDevolucion;
    public javax.swing.JMenu menuObras;
    public javax.swing.JMenu menuPedidos;
    public javax.swing.JMenu menuPrestamoMateriales;
    public javax.swing.JMenu menuProveedores;
    public javax.swing.JMenu menuRecepciones;
    public javax.swing.JMenu menuSalidaMateriales;
    public javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}