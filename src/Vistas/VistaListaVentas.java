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
import java.util.ArrayList;
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
        venData  = new VentaData();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel1.setText("VENTAS");

        tablaVentas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaVentas.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
        columnas.add("Precio");

        for (Object columna : columnas) {
            modelo.addColumn(columna);   //para agregarle columna x columna recorremos con un for each la lista columnas
        }
        tablaVentas.setModel(modelo); //le setemos por ultimo el modelo a la tabla

        limpiarTabla();
        CargarTabla();
    }
    
     private void CargarTabla() {
        ventas = venData.listaVentas();
        

        for (Venta aux : ventas) {
            Cliente c1 = cD.buscarCliente(aux.getCliente().getIdCliente());
            Venta v1 = venData.buscarVentaPorID(aux.getIdVenta());
            DetalleVenta dv1 = dV.buscarDetalle(v1.getIdVenta());
//            Producto p1 = pD.buscarProductoPorID(dv1.getProducto().getIdProducto());
            
            modelo.addRow(new Object[]{aux.getIdVenta(), aux.getFecha(), c1.getNombre(), c1.getApellido(), c1.getTelefono(),"", dv1.getPrecioVenta()}); 
//            modelo.addRow(new Object[]{aux.getIdVenta(), aux.getFecha(), c1.getNombre(), c1.getApellido(), c1.getTelefono(), dv1.getProducto().getNombre(), dv1.getPrecioVenta()});  //cremos la fila de la tabla agregandole valor a sus 3 columnas
        }
    }
     
     private void limpiarTabla() {
        int filas = modelo.getRowCount() - 1; //saber cantidad de filas

        for (int i = filas; i >= 0; i--) {   //recorre para borralas una x una
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
