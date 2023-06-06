/*
 Realizar pedidos a proveedores: 
Los usuarios podrán registrar pedidos de productos a los proveedores. 

Deberán especificar  el producto solicitado, la cantidad y la fecha del pedido.
 */
package ClasesData;

import Modelo.Producto;
import Modelo.Proveedor;
import java.sql.Connection;

/**
 *
 * @author wilgortiz
 */
public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {

        con = Conexion.getConexion();

    }

    
    
    
    public void registrarPedidos(Proveedor prodProvee){
    // "SELECT * FROM producto WHERE  stock>0 ";
    String sql= "SELECT * FROM proveedor WHERE "
    }
}
