package ClasesData;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = null;

    public ClienteData() {

        con = Conexion.getConexion();

    }

    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt("idCliente"));

                JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente" + ex.getMessage());

        }
    }

    public void eliminarCliente(String tel) {
        String sql = "DELETE FROM cliente WHERE telefono=?";

        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, tel);

            int aux = ps.executeUpdate();
            if (aux == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cliente" + ex.getMessage());
        }
    }

    public void modificarCliente(Cliente nuevoCliente, String tel) {
        String sql = "UPDATE cliente SET apellido=? , nombre=? , domicilio=? , telefono=? WHERE telefono=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nuevoCliente.getApellido());
            ps.setString(2, nuevoCliente.getNombre());
            ps.setString(3, nuevoCliente.getDomicilio());
            ps.setString(4, nuevoCliente.getTelefono());
            ps.setString(5, tel);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El cliente se actualizo correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar el cliente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex.getMessage());
        }

    }
}
