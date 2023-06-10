package ClasesData;

import Modelo.Cliente;
import Modelo.DetalleCompra;
import Modelo.DetalleVenta;
import Modelo.Producto;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {

        con = Conexion.getConexion();

    }

    public void registrarProducto(Producto producto) {
        String sql = "INSERT INTO producto(descripcion, precioActual, stock, estado) VALUES (?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getDescripcion());
            ps.setDouble(2, producto.getPrecioActual());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto" + ex.getMessage());
        }

    }

    public List<Producto> listarProductos() {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM producto WHERE  stock>0 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();

                producto.setDescripcion(rs.getString("descripcion"));
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setPrecioActual(rs.getDouble("PrecioActual"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));

                productos.add(producto);
                /*
                
                alumno.setId_alumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getString("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnos.add(alumno);
                 */
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto " + ex.getMessage());
        }
        return productos;
    }
    
    
    public void incrementarStock (int idProducto, DetalleCompra compra, int stock){
        String sql = "UPDATE producto SET stock= ?  WHERE producto.idProducto = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock + compra.getCantidad());
            ps.setInt(2, idProducto);
            
             int exito = ps.executeUpdate();
               
               if (exito == 1){
                   JOptionPane.showMessageDialog(null, "El stock se actualizo correctamente");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al actualizar el stock");
               }
               ps.close();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
        
    }
    
    public void decrementarStock (int idProducto, DetalleVenta venta, int stock){
        String sql = "UPDATE producto SET stock= ?  WHERE producto.idProducto = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, stock - venta.getCantidad());
            ps.setInt(2, idProducto);
            
             int exito = ps.executeUpdate();
               
               if (exito == 1){
                   JOptionPane.showMessageDialog(null, "El stock se actualizo correctamente");
               }else{
                   JOptionPane.showMessageDialog(null, "Error al actualizar el stock");
               }
               ps.close();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
        
    }

}
