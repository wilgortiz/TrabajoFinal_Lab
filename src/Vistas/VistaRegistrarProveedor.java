/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ClasesData.ProveedorData;
import Modelo.Proveedor;

/**
 *
 * @author wilgortiz
 */
public class VistaRegistrarProveedor extends javax.swing.JInternalFrame {

    private final ProveedorData vP;

    public VistaRegistrarProveedor() {
        initComponents();
        this.vP = new ProveedorData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botongregarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonEliminarCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textonombreCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        textoapellidoCliente = new javax.swing.JTextField();
        textodomicilioCliente = new javax.swing.JTextField();
        textotelefonoCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonagregarProv = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        botonEliminarProv = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textonombreProv = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        textoRazonSocialProv = new javax.swing.JTextField();
        textodomicilioProv = new javax.swing.JTextField();
        textotelefonoProv = new javax.swing.JTextField();
        botonModificarProv = new javax.swing.JButton();
        botonSalir1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        botongregarCliente.setText("Agregar Cliente");
        botongregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botongregarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        botonEliminarCliente.setText("Eliminar Cliente");
        botonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Agregar clientes");

        jLabel4.setText("Domicilio");

        jLabel5.setText("Telefono");

        jButton1.setText("Modificar Cliente");

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTES");

        botonagregarProv.setText("Registrar Proveedor");
        botonagregarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonagregarProvActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre Proveedor");

        botonEliminarProv.setText("Eliminar Cliente");
        botonEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProvActionPerformed(evt);
            }
        });

        jLabel8.setText("Razon Social");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Registrar Proveedores");

        jLabel10.setText("Domicilio");

        jLabel11.setText("Telefono");

        botonModificarProv.setText("Modificar Cliente");

        botonSalir1.setText("SALIR");
        botonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalir1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PROVEEDORES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(botonEliminarProv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificarProv)))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSalir1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textodomicilioProv, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoRazonSocialProv, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textotelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(textonombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonagregarProv)
                                .addGap(242, 242, 242)))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textonombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textoRazonSocialProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textodomicilioProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textotelefonoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonagregarProv)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificarProv)
                    .addComponent(botonSalir1)
                    .addComponent(botonEliminarProv))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botongregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botongregarClienteActionPerformed

        //         boolean estado = false;
        //        if (checkActivo.isSelected()) {
        //            estado = true;
        //        } else if (checkInactivo.isSelected()) {
        //            estado = false;
        //        }
//           ps.setString(1, provee.getNombre());
//            ps.setString(2, provee.getRazonSocial());
//            ps.setString(3, provee.getDomicilio());
//            ps.setString(4, provee.getTelefono());

    }//GEN-LAST:event_botongregarClienteActionPerformed

    private void botonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarClienteActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonagregarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonagregarProvActionPerformed

        Proveedor p1 = new Proveedor(textonombreProv.getText(), textoRazonSocialProv.getText(),
                textodomicilioProv.getText(),
                textotelefonoProv.getText());

        //registramos al proveedor
        vP.registrarProveedor(p1);
        limpiar();
    }//GEN-LAST:event_botonagregarProvActionPerformed

    public void limpiar() {
        textonombreProv.setText("");
        textoRazonSocialProv.setText("");
        textodomicilioProv.setText("");
        textotelefonoProv.setText("");
    }

    private void botonEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarProvActionPerformed

    private void botonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalir1ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarCliente;
    private javax.swing.JButton botonEliminarProv;
    private javax.swing.JButton botonModificarProv;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSalir1;
    private javax.swing.JButton botonagregarProv;
    private javax.swing.JButton botongregarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField textoRazonSocialProv;
    private javax.swing.JTextField textoapellidoCliente;
    private javax.swing.JTextField textodomicilioCliente;
    private javax.swing.JTextField textodomicilioProv;
    private javax.swing.JTextField textonombreCliente;
    private javax.swing.JTextField textonombreProv;
    private javax.swing.JTextField textotelefonoCliente;
    private javax.swing.JTextField textotelefonoProv;
    // End of variables declaration//GEN-END:variables
}
