
package Modelo;


public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String razonSocial;
    private String domicilio;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombre, String razonSocial, String domicilio, String telefono) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Proveedor(String nombre, String razonSocial, String domicilio, String telefono) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

   

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }

   
    
    
    
    
    
    }
    
    
    
    
    
    

