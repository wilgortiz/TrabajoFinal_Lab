package Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemAgregarCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        itemRegistrarProv = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuRegistrar = new javax.swing.JMenuItem();
        itemInventario = new javax.swing.JMenuItem();
        itemRegistro = new javax.swing.JMenu();
        itemRegistrar = new javax.swing.JMenuItem();
        itemRegistroLista = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jMenu1.setText("Cliente");

        itemAgregarCliente.setText("agregar un cliente");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemAgregarCliente);

        jMenuItem1.setText("buscar cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        MenuProveedor.setText("Proveedor");
        MenuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedorActionPerformed(evt);
            }
        });

        itemRegistrarProv.setText("Registrar Proveedor");
        itemRegistrarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarProvActionPerformed(evt);
            }
        });
        MenuProveedor.add(itemRegistrarProv);

        jMenuBar1.add(MenuProveedor);

        jMenu2.setText("Compra");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Producto");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        menuRegistrar.setText("Registrar");
        menuRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarActionPerformed(evt);
            }
        });
        jMenu3.add(menuRegistrar);

        itemInventario.setText("Inventario");
        itemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemInventarioActionPerformed(evt);
            }
        });
        jMenu3.add(itemInventario);

        jMenuBar1.add(jMenu3);

        itemRegistro.setText("Venta");
        itemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroActionPerformed(evt);
            }
        });

        itemRegistrar.setText("Registrar");
        itemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarActionPerformed(evt);
            }
        });
        itemRegistro.add(itemRegistrar);

        itemRegistroLista.setText("Registro de Ventas");
        itemRegistroLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroListaActionPerformed(evt);
            }
        });
        itemRegistro.add(itemRegistroLista);

        jMenuBar1.add(itemRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //vista alumno    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaCliente vcl = new VistaCliente();   //creamos la vista cliente
        vcl.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(vcl);
        escritorio.moveToFront(vcl);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaAgregarClientes vcl2 = new VistaAgregarClientes();   //creamos la vista cliente
        vcl2.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(vcl2);
        escritorio.moveToFront(vcl2);
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void MenuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProveedorActionPerformed

    private void itemRegistrarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarProvActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaRegistrarProveedor vP = new   VistaRegistrarProveedor ();   //creamos la vista cliente
        vP.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(vP);
        escritorio.moveToFront(vP);
    }//GEN-LAST:event_itemRegistrarProvActionPerformed

    private void menuRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaRegistrarProducto rP = new   VistaRegistrarProducto();   //creamos la vista cliente
        rP.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(rP);
        escritorio.moveToFront(rP);
    }//GEN-LAST:event_menuRegistrarActionPerformed

    private void itemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInventarioActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaListaProductos lP = new   VistaListaProductos();   //creamos la vista cliente
        lP.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(lP);
        escritorio.moveToFront(lP);
    }//GEN-LAST:event_itemInventarioActionPerformed

    private void itemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroActionPerformed
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaListaVentas lV = new   VistaListaVentas();   //creamos la vista cliente
        lV.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(lV);
        escritorio.moveToFront(lV);
    }//GEN-LAST:event_itemRegistroActionPerformed

    private void itemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarActionPerformed
       
        escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaVentas vV = new VistaVentas();   //creamos la vista cliente
        vV.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(vV);
        escritorio.moveToFront(vV);
    }//GEN-LAST:event_itemRegistrarActionPerformed

    private void itemRegistroListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroListaActionPerformed
         escritorio.removeAll(); //remover todo
        escritorio.repaint(); //redibujar     

        VistaListaVentas lV = new   VistaListaVentas();   //creamos la vista cliente
        lV.setVisible(true); //hacemos visible esa vista

        //agregamos y la llevamos al frente del escritorio
        escritorio.add(lV);
        escritorio.moveToFront(lV);
    }//GEN-LAST:event_itemRegistroListaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAgregarCliente;
    private javax.swing.JMenuItem itemInventario;
    private javax.swing.JMenuItem itemRegistrar;
    private javax.swing.JMenuItem itemRegistrarProv;
    private javax.swing.JMenu itemRegistro;
    private javax.swing.JMenuItem itemRegistroLista;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuRegistrar;
    // End of variables declaration//GEN-END:variables
}
