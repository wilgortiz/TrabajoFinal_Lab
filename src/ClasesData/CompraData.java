/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import Modelo.Compra;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 54266
 */
public class CompraData {

    private Connection con = null;

    public CompraData() {

        con = Conexion.getConexion();

    }

    public void registrarCompra(Compra compra, int id) {

        String sql = " INSERT INTO compra (idProveedor, fecha) VALUES (?,?) ";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.setDate(2, Date.valueOf(compra.getFecha()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {
                compra.setIdCompra(rs.getInt("idCompra"));
                JOptionPane.showMessageDialog(null, "Compra generada");
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla Compra"+ex.getMessage());

        }

    }
}
