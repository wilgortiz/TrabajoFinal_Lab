
package Modelo;

public class Producto {
    private int idProducto;
    private String descripcion;
    private double precioActual;
    private int stock; //cantidad que tenemos. ej: 50 palas
    private boolean estado; //vendemos pero hay/no hay stock por ej.

    public Producto() {
    }
    
    public Producto(int idProducto, String descripcion, double precioActual, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(String descripcion, double precioActual, int stock, boolean estado) {
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.estado = estado;
    }

    
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
    
    
    
}
