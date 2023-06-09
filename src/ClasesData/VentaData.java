/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import Modelo.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wilgortiz
 */
public class VentaData {
   
     private Connection con = null;

    public VentaData() {

        con = Conexion.getConexion();

    }
    
    public void registrarVenta(Venta venta){
        String sql = "INSERT INTO venta(fecha, idCliente) VALUES (?,?);";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setDate(1, Date.valueOf(venta.getFecha()));
             ps.setInt(2, venta.getCliente().getIdCliente());
             
             ps.executeUpdate();
             
             ResultSet rs = ps.getGeneratedKeys();
             
             while (rs.next()) {
                 venta.setIdVenta(rs.getInt("isVenta"));
                 JOptionPane.showMessageDialog(null, "Venta registrada");
                 
             }
             
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
         }
    }
    
    
    
    
    
    
    
    
}
