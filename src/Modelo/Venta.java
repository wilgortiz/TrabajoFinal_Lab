package Modelo;


import java.time.LocalDate;

public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(int idVenta, LocalDate fecha, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Venta(LocalDate fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getIdCliente() {
        return cliente;
    }

    public void setIdCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
