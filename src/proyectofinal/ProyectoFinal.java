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

        /* prueba de producto y cliente. funciona bien. 
      
        Producto p1 = new Producto("Heladera nokia", 270000, 5, true);
        ProductoData pD = new ProductoData();
        pD.registrarProducto(p1);
        System.out.println(pD.listarProductos());

        Cliente c1 = new Cliente("paz", "guerra", "Juana Koslay", "26123654");
        Cliente c2 = new Cliente("gugli", "lucas", "san luis", "2664587942");

        ClienteData cD = new ClienteData();
        cD.agregarCliente(c1);
        cD.agregarCliente(c2);
        //  cD.eliminarCliente("26123654");

        Cliente c3 = new Cliente("perez", "mateo", "san luis", "2664123456");
        cD.modificarCliente(c3, "26123654");
         */
        
        Producto p1 = new Producto("heladera samsung", "heladera nofrost", "heladeras", 300000, 5, true);
        ProductoData pD = new ProductoData();
        pD.registrarProducto(p1);
        System.out.println(pD.listarProductos());
        
        
        pD.buscarProducto("heladera samsung");
//        System.out.println("el prod buscado es "+pD.buscarProducto("microondas"));
        
        
        if (pD.buscarProducto("heladera samsung")==null) {
            System.out.println("no existe ese producto");
        }else{
            System.out.println(""+pD.buscarProducto("heladera samsung"));
        }
        
      //  pD.eliminarProducto("");
    }

}
