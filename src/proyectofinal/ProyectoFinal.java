/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import ClasesData.ClienteData;
import ClasesData.ProductoData;
import Modelo.Cliente;
import Modelo.Producto;

/**
 *
 * @author 54266
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p1 = new Producto("Heladera nokia", 270000, 5, true);
        ProductoData pD = new ProductoData();
        pD.registrarProducto(p1);
        System.out.println(pD.listarProductos());      
        
        
        
        
   //     Cliente c1 = new Cliente("Ortiz", "Wilson", "Juana Koslay", "2664555555");
       // ClienteData cD = new ClienteData();
//        cD.agregarCliente(c1);
  //      cD.eliminarCliente(1);
    }
    
}
