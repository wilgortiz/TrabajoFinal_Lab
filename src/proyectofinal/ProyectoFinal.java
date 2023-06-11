/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import ClasesData.ClienteData;
import ClasesData.ProductoData;
import ClasesData.ProveedorData;
import Modelo.Cliente;
import Modelo.*;
import Modelo.Producto;
import Modelo.Proveedor;
import ClasesData.*;
import java.time.LocalDate;

/**
 *
 * @author 54266
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        prueba de producto y cliente. funciona bien. 
        Producto p1 = new Producto("Heladera Samsung", "Plateada", "Comedor", 5, 300000, true);
        ProductoData pD = new ProductoData();
        pD.registrarProducto(p1);
        System.out.println(pD.listarProductos());

        Cliente c1 = new Cliente("paz", "guerra", "Juana Koslay", "26123654");
        Cliente c2 = new Cliente("gugli", "lucas", "san luis", "2664587942");

        ClienteData cD = new ClienteData();
        cD.agregarCliente(c1);
        cD.agregarCliente(c2);
        cD.eliminarCliente("26123654");

        Cliente c3 = new Cliente("perez", "mateo", "san luis", "2664123456");
        cD.modificarCliente(c3, "2664587942");

        //prueba de inventario y busqueda de productos
        System.out.println(pD.listarProductos());
        pD.buscarProducto("heladera samsung");
//       System.out.println("el prod buscado es "+pD.buscarProducto("Heladera "));

        if (pD.buscarProducto("heladera samsung") == null) {
            System.out.println("no existe ese producto");
        } else {
            System.out.println("" + pD.buscarProducto("heladera samsung"));
        }

        //prueba eliminar producto
        Producto p2 = new Producto("Microondas Philips", "Blanco", "Comedor", 4, 100000, true);
        ProductoData pD2 = new ProductoData();
        pD.registrarProducto(p2);

        pD.eliminarProducto("Microondas Philips");

        //registrar compra a proveedores
        Proveedor pr = new Proveedor("wilgo sa", "monotributista", "ruta 147545", "26154541");
        ProveedorData pDA = new ProveedorData();
        pDA.registrarProveedor(pr);

        Compra compra = new Compra(pr, LocalDate.parse("2023-06-06"));
        CompraData cDA = new CompraData();
        cDA.registrarCompra(compra, 1);

        //detalle compra
        DetalleCompra dc = new DetalleCompra(1, 300000, compra, p1);
        DetalleCompraData dcD = new DetalleCompraData();
        dcD.registrarDetalleCompra(dc, 1, 1);
        pD.incrementarStock(1, dc, p1.getStock());

        //registrar venta
        Producto p3 = new Producto("Horno Philips", "Blanco-200Wts", "Comedor", 100000, 2, true);
        ProductoData pD3 = new ProductoData();
        pD.registrarProducto(p3);

        Venta venta = new Venta(LocalDate.parse("2023-06-06"), c2);
        VentaData vD = new VentaData();
        vD.registrarVenta(venta, 2);

//        Detalle de venta DetalleVenta 
        DetalleVenta dV = new DetalleVenta(1, 350000, venta, p1);
        DetalleVentaData dvD = new DetalleVentaData();
        dvD.registrarDetalleVenta(dV, 1, 1);
        pD.decrementarStock(1, dV, p1.getStock());

//        consultar ventas 
        System.out.println("VENTAS REALIZADAS:\n " + vD.listaVentas().toString());

    }

}
