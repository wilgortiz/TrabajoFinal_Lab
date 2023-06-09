/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import ClasesData.ProductoData;
import Modelo.Producto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darioPascuali
 */
public class VistaListaProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ProductoData pD;
    private ArrayList<Producto> listaProductos;

    public VistaListaProductos() {
        initComponents();
        modelo = new DefaultTableModel();
        pD = new ProductoData();
        crearTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(255, 230, 0));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 57, 112));
        jLabel2.setText("Fravemax");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 57, 112));
        jLabel3.setText("Inventario de Productos");

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("X");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 57, 112));
        jLabel5.setText("Filtrar por nombre:");

        textoBuscar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        textoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoBuscarKeyReleased(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setText("*Haga doble click sobre los campos de la tabla para editar");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel3)
                        .addGap(0, 281, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(67, 67, 67)
                .addComponent(btnEliminar)
                .addGap(287, 287, 287))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int id = (int) modelo.getValueAt(tablaProductos.getSelectedRow(), 0);
        pD.eliminarProducto(id);
        limpiarTabla();
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = (int) modelo.getValueAt(tablaProductos.getSelectedRow(), 0);
        String nombre = (String) modelo.getValueAt(tablaProductos.getSelectedRow(), 1);
        String descripcion = (String) modelo.getValueAt(tablaProductos.getSelectedRow(), 2);
        String categoria = (String) modelo.getValueAt(tablaProductos.getSelectedRow(), 3);

        double precio = 0;
        int stock = 0;

        Producto p = new Producto();

        try {
            precio = Double.parseDouble(modelo.getValueAt(tablaProductos.getSelectedRow(), 4).toString());
            stock = Integer.parseInt(modelo.getValueAt(tablaProductos.getSelectedRow(), 5).toString());

            p = new Producto(id, nombre, descripcion, categoria, precio, stock);

            if ("disponible".equals(modelo.getValueAt(tablaProductos.getSelectedRow(), 6).toString().toLowerCase())) {

                p.setEstado(true);
                pD.modificarProducto(p);
            } else if ("no disponible".equals(modelo.getValueAt(tablaProductos.getSelectedRow(), 6).toString().toLowerCase())) {

                p.setEstado(false);
                pD.modificarProducto(p);
            } else {
                JOptionPane.showMessageDialog(null, "Los valores de Estado deben ser Disponible o No disponible");
            }

            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Los valores de Precio y Stock deben ser numericos");
        }

        limpiarTabla();
        CargarTabla();


    }//GEN-LAST:event_btnModificarActionPerformed

    private void textoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyReleased
        String subCadena = textoBuscar.getText();
        System.out.println(subCadena);
        try {
            ArrayList<Producto> listaProductos2 = (ArrayList<Producto>) pD.listarProductosPorSubCadena(subCadena);

            for (Producto aux : listaProductos2) {
                String estado;
                if (aux.isEstado()) {
                    estado = "Disponible";
                } else {
                    estado = "No disponible";
                }

                modelo.addRow(new Object[]{aux.getIdProducto(), aux.getNombre(), aux.getDescripcion(), aux.getCategoria(), aux.getPrecioActual(), aux.getStock(), estado});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
            }
        } catch (Exception e) {
            limpiarTabla();
        }
    }//GEN-LAST:event_textoBuscarKeyReleased

    private void textoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyPressed
        limpiarTabla();
    }//GEN-LAST:event_textoBuscarKeyPressed

    private void crearTabla() {

        //para cargar los datos de inscripcion a la tabla
        //columnas:
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Descripcion");
        columnas.add("Categoria");
        columnas.add("Precio");
        columnas.add("Stock");
        columnas.add("Estado");
        
        modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            
            return column != 0; 
        }
    };


        for (Object columna : columnas) {
            modelo.addColumn(columna);   //para agregarle columna x columna recorremos con un for each la lista columnas
        }
        tablaProductos.setModel(modelo); //le setemos por ultimo el modelo a la tabla

        limpiarTabla();
        CargarTabla();

    }

    private void CargarTabla() {
        listaProductos = (ArrayList<Producto>) pD.listarProductos();

        for (Producto aux : listaProductos) {

            String estado;
            if (aux.isEstado()) {
                estado = "Disponible";
            } else {
                estado = "No disponible";
            }
          
            modelo.addRow(new Object[]{aux.getIdProducto(), aux.getNombre(), aux.getDescripcion(), aux.getCategoria(), aux.getPrecioActual(), aux.getStock(), estado});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
        }
    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount() - 1; //saber cantidad de filas

        for (int i = filas; i >= 0; i--) {   //recorre para borralas una x una
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables

}
