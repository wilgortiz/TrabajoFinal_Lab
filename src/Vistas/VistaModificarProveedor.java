
package Vistas;

import ClasesData.*;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class VistaModificarProveedor extends javax.swing.JInternalFrame {

 
    private Proveedor proveedor;
    private ProveedorData pD;

    private DefaultTableModel modelo;

    private ArrayList<Proveedor> listaProveedores;

    public VistaModificarProveedor() {
        initComponents();
        
        proveedor = new Proveedor();
        this.pD = new ProveedorData();

        modelo = new DefaultTableModel();

        listaProveedores = new ArrayList<>();

        crearTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 248, 2));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Modificar y Eliminar Proveedor");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Filtrar por Nombre:");

        textoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoBuscarKeyReleased(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProveedores);

        btnModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("*Haga doble click en la celda que desea editar");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 57, 112));
        jLabel3.setText("Fravemax");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(67, 67, 67)
                                .addComponent(btnEliminar)
                                .addGap(211, 211, 211)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)))
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyPressed
        limpiarTabla();
    }//GEN-LAST:event_textoBuscarKeyPressed

    private void textoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoBuscarKeyReleased
        String subCadena = textoBuscar.getText();
        System.out.println(subCadena);
        try {
            ArrayList<Cliente> listaClientes2 = (ArrayList<Cliente>) cD.listarClientesPorSubCadena(subCadena);

            for (Cliente aux : listaClientes2) {

                modelo.addRow(new Object[]{aux.getIdCliente(), aux.getNombre(), aux.getApellido(), aux.getDomicilio(), aux.getTelefono()});
            }
        } catch (Exception e) {
            limpiarTabla();
        }
    }//GEN-LAST:event_textoBuscarKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        try {
            int id = (int) modelo.getValueAt(tablaProveedores.getSelectedRow(), 0);
            String nombre = (String) modelo.getValueAt(tablaProveedores.getSelectedRow(), 1);
            String apellido = (String) modelo.getValueAt(tablaProveedores.getSelectedRow(), 2);
            String direccion = (String) modelo.getValueAt(tablaProveedores.getSelectedRow(), 3);
            String telefono = (String) modelo.getValueAt(tablaProveedores.getSelectedRow(), 4);

            // Expresión regular para validar que ingrese numeros y ademas el caracter vacío
            String regex = "^[0-9 ]*$";

            // Comprobamos si el telefono cumple con el patron. Debe ingresar numeros.
            if (telefono.matches(regex)) {

                cliente = new Cliente(id, apellido, nombre, direccion, telefono);

                cD.modificarCliente(cliente, id);
            } else {
                JOptionPane.showMessageDialog(null, "El telefono debe ser numerico");
            }

        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, "Selecciona un Cliente");
        }

        limpiarTabla();
        CargarTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String telefono = (String) modelo.getValueAt(tablaProveedores.getSelectedRow(), 4);
        cD.eliminarCliente(telefono);
        limpiarTabla();
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void crearTabla() {

        //para cargar los datos de inscripcion a la tabla
        //columnas:
        ArrayList<Object> columnas = new ArrayList<Object>();
       
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Razon Social");
        columnas.add("Domicilio");
        columnas.add("Telefono");

        for (Object columna : columnas) {
            modelo.addColumn(columna);   //para agregarle columna x columna recorremos con un for each la lista columnas
        }
        tablaProveedores.setModel(modelo); //le setemos por ultimo el modelo a la tabla

        limpiarTabla();
        CargarTabla();

    }

    private void CargarTabla() {
        listaProveedores= (ArrayList<Proveedor>) pD.listarProveedores();

        for (Proveedor aux : listaProveedores) {

            modelo.addRow(new Object[]{aux.getIdProveedor(), aux.getNombre(), aux.getRazonSocial(), aux.getDomicilio(), aux.getTelefono()});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField textoBuscar;
    // End of variables declaration//GEN-END:variables
}
