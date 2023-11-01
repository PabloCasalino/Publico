
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la 
* cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
public class CuentaBancariaServicio {
    
    Scanner sc = new Scanner(System.in);
    CuentaBancaria cb = new CuentaBancaria();
    
    
    public void crearCuenta(){
        System.out.println("Ingrese el numero de la cuenta");
    }
    
    public double ingresar(){
        
//        System.out.println("Ingrese la cantidad a ingresar: ");
//        double ingreso = sc.nextDouble();
//        
//        cb.setSaldoActual(ingreso + cb.getSaldoActual());
//        
//        return cb.setSaldoActual(ingreso);
    }
    
    public double retirar(){
        return 0;
    }
    
    public double extraccionrapida(){
        return 0;
    }
    
    public double consultarSaldo(){
        return 0;
    }
    public double consultarDatos(){
        return 0;
    }
}
