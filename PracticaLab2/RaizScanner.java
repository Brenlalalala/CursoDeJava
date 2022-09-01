package Ejercicio8;
import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args){
        Scanner scaner=new Scanner(System.in);

System.out.println("Ingrese un numero: ");
        int num = scaner.nextInt();
        System.out.println("La raiz de " +num+ " es = "+ Math.sqrt(num));
    }
}
