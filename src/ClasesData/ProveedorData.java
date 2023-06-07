/*
 Realizar pedidos a proveedores: 
Los usuarios podrán registrar pedidos de productos a los proveedores. 

Deberán especificar  el producto solicitado, la cantidad y la fecha del pedido.
 */
package ClasesData;

import Modelo.Compra;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.detalleCompra;
import java.sql.Connection;
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
public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {

        con = Conexion.getConexion();

    }

    public void registrarProveedor(Proveedor provee) {

        String sql = "INSERT INTO `proveedor`(`razonSocial`, `domicilio`, `telefono`) +"
                + " VALUES ('?','?','?')";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, provee.getRazonSocial());
            ps.setString(2, provee.getDomicilio());
            ps.setInt(3, provee.getTelefono());

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

    /*
 Realizar pedidos a proveedores: 
Los usuarios podrán registrar pedidos de productos a los proveedores. 
Deberán especificar  el producto solicitado, la cantidad y la fecha del pedido.
     */
    public void registrarPedidos(Producto producto, Compra compra, detalleCompra compraAproveedores) {

       String sql=  " INSERT INTO compra (idProveedor, fecha) VALUES ('?','?','?') ";
       
        
        // "SELECT * FROM producto WHERE  stock>0 ";
      
    }

}
