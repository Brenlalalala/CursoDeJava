package Ejercicio10;

import javax.swing.*;

public class AdivElNum {
    public static void main(String[] args){
        int num, intentos=0;

    //El método Math.random genera un num aleatorio pero en double o,....
    int x = (int)(Math.random()*(101-1)+1);//para generar num entre 1 y 100 inclusive
        do {
    num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre 1 y 100: "));
        if(num>x){
        System.out.println("El num a adivinar es menor: ");
    }else {
        System.out.println("El num a adivinar es mayor: ");
    }
    intentos++;
}while(num != x);

        System.out.println("Acertaste el numero!. Es: "+x);
        System.out.println("Lo lograste en "+intentos+" intentos.");
    }
}