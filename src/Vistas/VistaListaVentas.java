/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import ClasesData.ClienteData;
import ClasesData.DetalleVentaData;
import ClasesData.ProductoData;
import ClasesData.VentaData;
import Modelo.Cliente;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Venta;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateo
 */
public class VistaListaVentas extends javax.swing.JInternalFrame {

    private List<Venta> ventas;
    private VentaData venData;
    private DetalleVenta dVenta;
    private Venta venta;
    private DefaultTableModel modelo;
    private ClienteData cD;
    private ProductoData pD;
    private DetalleVentaData dV;

    public VistaListaVentas() {
        initComponents();
        venta = new Venta();
        venData = new VentaData();
        ventas = new ArrayList<>();
        modelo = new DefaultTableModel();
        dVenta = new DetalleVenta();
        cD = new ClienteData();
        pD = new ProductoData();
        dV = new DetalleVentaData();

        CrearTabla();
        CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calendario2 = new com.toedter.calendar.JDateChooser();
        checkTodas = new javax.swing.JCheckBox();

        jPanel1.setBackground(new java.awt.Color(255, 255, 24));

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaVentas);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Registro de Ventas");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 57, 112));
        jLabel2.setText("Fravemax");

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

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Filtrar por fecha:");

        calendario2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendario2PropertyChange(evt);
            }
        });

        checkTodas.setText("Todas");
        checkTodas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkTodasItemStateChanged(evt);
            }
        });
        checkTodas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkTodasStateChanged(evt);
            }
        });
        checkTodas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                checkTodasMouseReleased(evt);
            }
        });
        checkTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTodasActionPerformed(evt);
            }
        });
        checkTodas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkTodasPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1266, 1266, 1266)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(checkTodas)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(calendario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTodas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void calendario2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendario2PropertyChange
        limpiarTabla();
        ventas = venData.listaVentas();
        // Obtener el valor seleccionado como objeto Calendar
        Calendar calendar = calendario2.getCalendar();

        // Convertir el objeto Calendar a LocalDate
        try {
            LocalDate fecha = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            for (Venta aux : ventas) {

                if (aux.getFecha().compareTo(fecha) == 0) {
                    Cliente c1 = cD.buscarCliente(aux.getCliente().getIdCliente());

                    DetalleVenta dv1 = dV.buscarDetalle(aux.getIdVenta());

                    modelo.addRow(new Object[]{aux.getIdVenta(), aux.getFecha(), c1.getNombre(), c1.getApellido(), c1.getTelefono(), dv1.getProducto().getNombre(), dv1.getCantidad(), dv1.getPrecioVenta()});
                }

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_calendario2PropertyChange

    private void checkTodasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkTodasStateChanged
      
    }//GEN-LAST:event_checkTodasStateChanged

    private void checkTodasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkTodasPropertyChange
       
    }//GEN-LAST:event_checkTodasPropertyChange

    private void checkTodasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkTodasMouseReleased
    
    }//GEN-LAST:event_checkTodasMouseReleased

    private void checkTodasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkTodasItemStateChanged
        
    }//GEN-LAST:event_checkTodasItemStateChanged

    private void checkTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTodasActionPerformed
          limpiarTabla();
        if(checkTodas.isSelected()){
        CargarTabla();
        }
    }//GEN-LAST:event_checkTodasActionPerformed

    private void CrearTabla() {

        //para cargar los datos de inscripcion a la tabla
        //columnas:
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Fecha");
        columnas.add("Nombre");
        columnas.add("Apellido");
        columnas.add("Telefono");
        columnas.add("Producto");
        columnas.add("Cantidad");
        columnas.add("Precio");

        for (Object columna : columnas) {
            modelo.addColumn(columna);   //para agregarle columna x columna recorremos con un for each la lista columnas
        }
        tablaVentas.setModel(modelo); //le setemos por ultimo el modelo a la tabla

        limpiarTabla();

    }

    private void CargarTabla() {
        ventas = venData.listaVentas();

        for (Venta aux : ventas) {

            Cliente c1 = cD.buscarCliente(aux.getCliente().getIdCliente());

            DetalleVenta dv1 = dV.buscarDetalle(aux.getIdVenta());

            modelo.addRow(new Object[]{aux.getIdVenta(), aux.getFecha(), c1.getNombre(), c1.getApellido(), c1.getTelefono(), dv1.getProducto().getNombre(), dv1.getCantidad(), dv1.getPrecioVenta()});

        }
    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount() - 1; //saber cantidad de filas

        for (int i = filas; i >= 0; i--) {   //recorre para borralas una x una
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser calendario2;
    private javax.swing.JCheckBox checkTodas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
