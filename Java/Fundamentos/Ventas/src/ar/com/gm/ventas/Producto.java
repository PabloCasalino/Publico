
package ar.com.gm.ventas;

public class Producto {
   
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
    this.idProducto = ++Producto.contadorProducto;
}

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
   }
