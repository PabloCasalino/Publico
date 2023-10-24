package ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ejercicios {

    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {

        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
        System.out.print("Ingrese un numero entero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese un segundo numero entero: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma es: " + suma);
    }

    public void ejercicio2() {
//        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Tu nombre es: " + nombre);

    }

    public void ejercicio3() {
// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
    }

    public void ejercicio4() {
// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

        System.out.println("Ingrese la cantidad de grados a convertir: ");
        double grad = sc.nextDouble();
        double c = 32 + (9 * grad / 5);

        System.out.println(grad + "° Celsius equivalen a " + c + " grados Farenheit");
    }

    public void ejercicio5() {
// Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        
        System.out.println("El doble de " + num + " es: " + (num * 2 ));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raiz cuadrada de " + num + " es: " + (Math.sqrt(num)));
    }
}
