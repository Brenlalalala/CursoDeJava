package Ejercicio11;

import java.util.Scanner;

public class UsoCuenta {
    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);

        CuentaCorriente cuenta1 = new CuentaCorriente();
        System.out.print ("Introduzca el nombre del titular: ");
        String titular = scaner.nextLine();
        System.out.print ("Introduzca el saldo inicial: ");
        Double saldo = scaner.nextDouble();


        CuentaCorriente cuenta2 = new CuentaCorriente();

//Pedimos el importe al usuario por consola
        Double importe = 0.0;
        System.out.print ("\nIntroduzca el importe a transferir entre cuentas: ");
        importe = scaner.nextDouble();
        //Hacemos una transferencia desde la Cta1 a la Cta2
        //cuenta1.Transferencia(cuenta1, cuenta2, importe);


        //Mostramos los datos de las cuentas bancarias por consola

        cuenta1.verInformacion();
       cuenta2.verInformacion();


    }
}




