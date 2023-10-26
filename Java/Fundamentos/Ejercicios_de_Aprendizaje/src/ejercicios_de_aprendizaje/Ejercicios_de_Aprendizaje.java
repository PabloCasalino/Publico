package ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ejercicios_de_Aprendizaje {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Guia_1 e = new Guia_1();

        System.out.println("INGRESE EL EJERCICIO A PROBAR");

        System.out.println("Ejercicio 1: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma");
        System.out.println("Ejercicio 2:  Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla");
        System.out.println("Ejercicio 3: Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.");
        System.out.println("Ejercicio 4: Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> e.ejercicio1();
            case 2 -> e.ejercicio2();
            case 3 -> e.ejercicio3();
            case 4 -> e.ejercicio4();
            case 5 -> e.ejercicio5();
            default -> System.out.println("Ingrese un valor del 1 al 5");
        }

    }
}
