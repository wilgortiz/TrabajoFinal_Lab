/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import Modelo.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wilgortiz
 */
public class DetalleVentaData {
    
    private Connection con = null;

    public DetalleVentaData() {

        con = Conexion.getConexion();
    }
    
    public void registrarDetalleVenta(DetalleVenta detalle){ //cree en productoData un metodo modificar producto, para que cuando compremos o vendamos ese producto se modifique stock
        String sql = "INSERT INTO detalleventa(cantidad, precioVenta, idVenta, idProducto) VALUES (?,?,?,?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getCantidad());
            ps.setDouble(2, detalle.getPrecioVenta());
            ps.setInt(3, detalle.getVenta().getIdVenta());
            ps.setInt(4, detalle.getProducto().getIdProducto());
            
            int aux = ps.executeUpdate();
            
            if(aux == 1){
                JOptionPane.showMessageDialog(null, "Detalle de la venta registrado");
            }else{
                JOptionPane.showMessageDialog(null, "Fallo al registar el detalle de la venta");
            }
            
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla detalle de venta");
        }
        
        
    }
    
}
//int idDetalleVenta, int cantidad, double precioVenta, Venta venta, Producto producto