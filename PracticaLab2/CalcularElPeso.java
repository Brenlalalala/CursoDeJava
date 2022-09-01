package Ejercicio9;

import javax.swing.*;
import java.util.Scanner;

public class CalcularElPeso {

    public static void main(String[] args) {
        double PesoIdeal = 0;
        Scanner scaner=new Scanner(System.in);

        System.out.println("PESO IDEAL ");
        System.out.println("Ingresa tu altura: ");
        int altura = scaner.nextInt();
        System.out.println("Selecciona tu genero: ");
        System.out.println("1. Mujer");
        System.out.println("2. Hombre");
        int num = scaner.nextInt();
if (num == 1){
        PesoIdeal= altura - 120;
        System.out.println("Peso Ideal: "+ PesoIdeal);
}
else if (num == 2){
            PesoIdeal= altura - 110;
        System.out.println("Peso Ideal: "+ PesoIdeal);
} else {
        System.out.println("Seleccione una de las dos opciones");
    }
}
 }