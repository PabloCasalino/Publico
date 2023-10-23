
package contadorid;


public class Orden {
    
    private int idProducto;
    private String  nombre;
    private double precio;
    private int contadorProducto;

//    public Orden() {
//        this.idProducto = ++Orden.contadorProducto;
//    }

    public Orden(int idProducto, String nombre, double precio, int contadorProducto) {
//        this();
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.contadorProducto = contadorProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getContadorProducto() {
        return contadorProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setContadorProducto(int contadorProducto) {
        this.contadorProducto = contadorProducto;
    }

    @Override
    public String toString() {
        return "Orden{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", contadorProducto=" + contadorProducto + '}';
    }


    
    
    
}
