package ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Guia_2 {

    Scanner sc = new Scanner(System.in);

    public void MenuGuia_2() {
        System.out.println("INGRESE EL EJERCICIO A PROBAR");

        System.out.println("Ejercicio 1: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma");
        System.out.println("Ejercicio 2:");
        System.out.println("Ejercicio 3:");
        System.out.println("Ejercicio 4:");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 ->
                Ejercicio1();
//            case 2 ->
//                e.ejercicio2();
//            case 3 ->
//                e.ejercicio3();
//            case 4 ->
//                e.ejercicio4();
//            case 5 ->
//                e.ejercicio5();
            default ->
                System.out.println("Ingrese un valor del 1 al 5");
        }
    }

    public void Ejercicio1() {
        /*  Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
         */

        System.out.println("Ingrese un número: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = Sumar(num1, num2);
        System.out.println("La suma es: " + suma);

        double resta = Restar(num1, num2);
        System.out.println("La resta es: " + resta);

        double prod = Multiplicar(num1, num2);
        System.out.println("El producto es: " + prod);

        double coc = Dividir(num1, num2);
        System.out.println("La división es : " + coc);
    }

    public double Sumar(double num1, double num2) {
        double suma = num1 + num2;
        return suma;
    }

    public double Restar(double num1, double num2) {
        double resta = num1 - num2;
        return resta;
    }

    public double Multiplicar(double num1, double num2) {
        double prod = num1 * num2;
        return prod;
    }

    public double Dividir(double num1, double num2) {
        double coc = num1 / num2;
        return coc;
    }
}
