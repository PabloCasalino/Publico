package ejercicios_de_aprendizaje;

import java.util.Scanner;

public class Ejercicios_de_Aprendizaje {

    public static void main(String[] args) {
        
        Guia_1 g1 = new Guia_1();
        Guia_2 g2 = new Guia_2();
        
        Scanner sc = new Scanner(System.in);
         System.setProperty("file.encoding", "UTF-8");
        
        System.out.println("Ingrese la guia que quiere revisar: ");
        System.out.println("1 - Guia 1: Introduccion ");
        System.out.println("2 - Guia 2: Subprogramas y funciones");
        
        int opcion = sc.nextInt();
        switch (opcion){
            case 1 -> g1.MenuGuia_1();
            case 2 -> g2.MenuGuia_2();
        }

    }
}
