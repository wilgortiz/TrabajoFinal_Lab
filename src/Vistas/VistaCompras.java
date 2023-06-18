/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelo.*;
import ClasesData.*;
import com.sun.xml.internal.ws.util.xml.CDATA;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54266
 */
public class VistaCompras extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ArrayList<Proveedor> listaProveedores;
    private ArrayList<Producto> listaProductos;
    private ProveedorData proveD;
    private ProductoData produD;
    private CompraData cD;
    private DetalleCompraData detalleCD;
    private String fecha;
    private Date fechaCalendar;

    private Compra compra;
    private Proveedor proveedor;
    private DetalleCompra detalleCompra;
    private Producto producto;

    public VistaCompras() {
        initComponents();
        modelo = new DefaultTableModel();
        listaProveedores = new ArrayList<>();
        listaProductos = new ArrayList<>();
        proveD = new ProveedorData();
        produD = new ProductoData();
        cD = new CompraData();
        detalleCD = new DetalleCompraData();
        compra = new Compra();
        proveedor = new Proveedor();
        detalleCompra = new DetalleCompra();
        producto = new Producto();

        cargarCombo();
        crearTabla();
        cargarTabla();
        textoFecha.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        botonComprar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textoCantidad = new javax.swing.JTextField();
        calendario = new com.toedter.calendar.JCalendar();
        textoFecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jPanel1.setBackground(new java.awt.Color(255, 230, 0));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(3, 57, 112));
        jLabel8.setText("Fravemax");

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

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Registrar Compra");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Elije un proveedor:");

        comboProveedores.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Filtrar por Nombre:");

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

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Selecciona un Producto:");

        textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNombreKeyReleased(evt);
            }
        });

        botonComprar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        botonComprar.setText("Comprar");
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Cantidad de Unidades:");

        calendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioMouseClicked(evt);
            }
        });
        calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioPropertyChange(evt);
            }
        });

        textoFecha.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("Indique la fecha de su compra:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)))
                .addGap(274, 274, 274))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(59, 59, 59)))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(botonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(textoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioPropertyChange
        fechaCalendar = calendario.getDate();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(fechaCalendar);

        textoFecha.setText(fecha);
    }//GEN-LAST:event_calendarioPropertyChange

    private void calendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioMouseClicked

    }//GEN-LAST:event_calendarioMouseClicked

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        //TOMAR PROVEEDOR DEL COMBO
        proveedor = (Proveedor) comboProveedores.getSelectedItem();

        LocalDate fechaLD = fechaCalendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //pasar date a LocalDate

        try {
            //OBTENER CANTIDAD DEL TEXTFIELD
            int cantidad = Integer.parseInt(textoCantidad.getText());

            try {

                //OBTENER VALORES DE LA FILA SELECCIONADA DE LA TABLA
                String nombre = (String) modelo.getValueAt(tablaProductos.getSelectedRow(), 0);
                producto = produD.buscarProducto(nombre);

                //REGISTRAR COMPRA
                compra = new Compra(proveedor, fechaLD);
                int idCompra = cD.registrarCompra(compra, proveedor.getIdProveedor()); //recuperar id compra al mismo tiempo q registro compra del resultset
                compra.setIdCompra(idCompra);

                //REGISTRAR DETALLE DE COMPRA
                detalleCompra = new DetalleCompra(cantidad, producto.getPrecioActual() * cantidad, compra, producto);
                detalleCD.registrarDetalleCompra(detalleCompra, idCompra, producto.getIdProducto());
                //INCREMENTAR STOCK

                produD.incrementarStock(producto.getIdProducto(), detalleCompra, producto.getStock());
                LimpiarTabla();
                cargarTabla();
                LimpiarTexto();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Seleccione un producto");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico para cantidad de unidades");
        }


    }//GEN-LAST:event_botonComprarActionPerformed

    private void textoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyReleased
        String subCadena = textoNombre.getText();
     
        try {
            ArrayList<Producto> listaProductos2 = (ArrayList<Producto>) produD.listarProductosPorSubCadena(subCadena);

            for (Producto aux : listaProductos2) {
                String estado;
                if (aux.isEstado()) {
                    estado = "Disponible";
                } else {
                    estado = "No disponible";
                }

                if (estado == "Disponible") {
                    modelo.addRow(new Object[]{aux.getNombre(), aux.getDescripcion(), aux.getCategoria(), aux.getPrecioActual(), aux.getStock(), estado});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
                }
            }
        } catch (Exception e) {
            LimpiarTabla();
        }
    }//GEN-LAST:event_textoNombreKeyReleased

    private void textoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyPressed
        LimpiarTabla();

    }//GEN-LAST:event_textoNombreKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarCombo() {
        listaProveedores = (ArrayList<Proveedor>) proveD.listarProveedores();

        for (Proveedor aux : listaProveedores) {
            comboProveedores.addItem(aux);
        }
    }

    private void cargarTabla() {
        listaProductos = (ArrayList<Producto>) produD.listarProductos();

        for (Producto aux : listaProductos) {

            String estado;
            if (aux.isEstado()) {
                estado = "Disponible";
            } else {
                estado = "No disponible";
            }
            if (estado == "Disponible") {
                modelo.addRow(new Object[]{aux.getNombre(), aux.getDescripcion(), aux.getCategoria(), aux.getPrecioActual(), aux.getStock(), estado});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
            }

        }
    }

    private void crearTabla() {
        //para cargar los datos de inscripcion a la tabla
        //columnas:
        ArrayList<Object> columnas = new ArrayList<Object>();

        columnas.add("Nombre");
        columnas.add("Descripcion");
        columnas.add("Categoria");
        columnas.add("Precio");
        columnas.add("Stock");
        columnas.add("Estado");

        for (Object columna : columnas) {
            modelo.addColumn(columna);   //para agregarle columna x columna recorremos con un for each la lista columnas
        }
        tablaProductos.setModel(modelo); //le setemos por ultimo el modelo a la tabla
    }

    private void LimpiarTabla() {
        int filas = modelo.getRowCount() - 1; //saber cantidad de filas

        for (int i = filas; i >= 0; i--) {   //recorre para borralas una x una
            modelo.removeRow(i);
        }
    }

    private void LimpiarTexto() {
        textoCantidad.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JCalendar calendario;
    private javax.swing.JComboBox<Proveedor> comboProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField textoCantidad;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
