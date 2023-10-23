package Servicio;

import contadorid.*;
import java.util.Scanner;

public class OrdenServicio {

    Scanner sc = new Scanner(System.in);
    Orden orden1 = new Orden();

    public void agregarProducto() {

        System.out.println("Insertar el nombre del Producto: ");
        orden1.setNombre(sc.nextLine());
        System.out.println("Insertar precio: ");
        orden1.setPrecio(sc.nextDouble());

    }
    
    public void mostrarPrecio(){
        System.out.println(orden1);
    }
}
