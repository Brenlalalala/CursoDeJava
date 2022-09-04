package Ejercicio11;

import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {

        Scanner scaner =new Scanner(System.in);

        CuentaCorriente cuenta1 = new CuentaCorriente(500,"Brenda");
        System.out.println(cuenta1.getdatosDelaCuenta());
        CuentaCorriente cuenta2 = new CuentaCorriente(500,"Pepe");
        System.out.println(cuenta2.getdatosDelaCuenta());
        System.out.println("Ingrese el importe a transferir:");
        double importe = scaner.nextDouble();
        cuenta1.Transferencia(cuenta2, importe);
        System.out.println("\nNuevo saldo:$ "+ cuenta1.getSaldoCuenta());

    }
}




