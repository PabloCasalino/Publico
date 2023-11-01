package ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Guia_2 {

    Scanner sc = new Scanner(System.in);

//  Metodo para limpiar la pantalla 
    public static void limpiarPantalla() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
    public void MenuGuia_2() {
        System.out.println("INGRESE EL EJERCICIO A PROBAR");

        System.out.println("Ejercicio 1: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos."
                + " El programa deberá después mostrar el resultado de la suma");
        System.out.println("Ejercicio 2: Calculador de edad");
        System.out.println("Ejercicio 3: Conversor de divisas");
   

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 ->
                Ejercicio1();
            case 2 ->
                ejercicio2();
            case 3 ->
                ejercicio3();
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

    public void ejercicio2() {
        Boolean pregunta = true;

        do {
            System.out.println("ingrese el nombre de la persona: ");
            String nombre = sc.next();

            System.out.println("Ingrese la edad: ");
            int edad = sc.nextInt();

            if (edad < 18) {
                System.out.println(nombre + " es menor de edad");
            } else if (edad > 18) {
                System.out.println(nombre + " es mayor de edad");
            }

            System.out.println("¿Desea seguir  ingresando datos? (S/N)");
            String quest = sc.next();

            if (quest.equalsIgnoreCase("n")) {
                pregunta = false;
            }
        } while (pregunta);

        System.out.println("Gracias por usar calculador de el calculador de edad");
    }
//                         **  Ejercicio 3 **    
//  Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
//  La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el 
//  cambio (void).
//  El cambio de divisas es:
//   0.86 libras es un 1 €
//   1.28611 $ es un 1 €
//   129.852 yenes es un 1 €

    public void ejercicio3() {
        System.out.print("Ingrese la cantidad de pesos: ");
        double pesos = sc.nextDouble();

        System.out.println("Ingrese la moneda a convertir:");
        System.out.println("1 - Dolares");
        System.out.println("2 - Euros");
        System.out.println("3 - Reales");
        int quest = sc.nextInt();

        switch (quest) {
            case 1 ->
                convertidorDolar(pesos);
            case 2 ->
                convertidorEuros(pesos);
            case 3 ->
                convertidorReales(pesos);
        }

    }

    private void convertidorDolar(double pesos) {

        double dolares = pesos / 900;
        System.out.println("$" + pesos + " son " + "U$D" + dolares);
    }

    private void convertidorEuros(double pesos) {

        double euros = pesos / 369.84;
        System.out.println("$" + pesos + " son " + "U$D" + euros);
    }

    private void convertidorReales(double pesos) {

        double reales = pesos / 69.8;
        System.out.println("$" + pesos + " son " + "U$D" + reales);
    }

}
