/*
 Realizar pedidos a proveedores: 
Los usuarios podrán registrar pedidos de productos a los proveedores. 

Deberán especificar  el producto solicitado, la cantidad y la fecha del pedido.
 */
package ClasesData;

import Modelo.Proveedor;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author wilgortiz
 */
public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {

        con = Conexion.getConexion();

    }

    public void registrarProveedor(Proveedor provee) {

        String sql = "INSERT INTO proveedor(nombre, razonSocial, domicilio, telefono)   VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, provee.getNombre());
            ps.setString(2, provee.getRazonSocial());
            ps.setString(3, provee.getDomicilio());
            ps.setString(4, provee.getTelefono());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {

                provee.setIdProveedor(rs.getInt("idProveedor"));
                JOptionPane.showMessageDialog(null, "proveedor agregado exitosamente");

            }

            rs.close(); //mejor rendimiento
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla proveedor " + ex.getMessage());

        }

    }
    
    public List<Proveedor> listarProveedores() {

        List<Proveedor> proveedores = new ArrayList<>();

        try {

            String sql = "SELECT * FROM proveedor";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor pr = new Proveedor();

               pr.setIdProveedor(rs.getInt("idProveedor"));
               pr.setNombre(rs.getString("nombre"));
               pr.setRazonSocial(rs.getString("razonSocial"));
               pr.setDomicilio(rs.getString("domicilio"));
               pr.setTelefono(rs.getString("telefono"));

                proveedores.add(pr);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Proveedor " + ex.getMessage());
        }
        return proveedores;
    }
    
     public Proveedor buscarProveedorPorID (int idProveedor){
        Proveedor p = null;
        String sql = "SELECT * FROM proveedor WHERE idProveedor=?";
            
           try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                p = new Proveedor();
                
                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setNombre(rs.getString("nombre"));
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getString("telefono"));
            }

            ps.close();
            rs.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }

        return p;
    }
     
    public void eliminarProveedor(String telefono) {
         String sql = "UPDATE producto SET estado=? WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

           
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El Producto se elimino correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el Producto");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto" + ex.getMessage());
        }
    }
    
}
