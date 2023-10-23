/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adm
 */
public class Computadora {
    
   // private final int idComputadora;
    private String nombre;
    private int contadorComputadora;
    Monitor monitor;
    Teclado teclado;
    Raton raton;

    public Computadora() {
    }

    public Computadora(String nombre, int contadorComputadora, Monitor monitor, Teclado teclado, Raton raton) {
 //       this.idComputadora = idComputadora;
        this.nombre = nombre;
        this.contadorComputadora = contadorComputadora;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }


    
}
