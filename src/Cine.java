import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int carga;
         Espectadores[] espectadores = new Espectadores[0];
        int i = 0;
        do {
            System.out.println("Ingrese 1 si desea agregar espectador\n Ingrese 0 si desea salir");
             carga = entrada.nextInt();
            try {

                System.out.println("Nombre:");
                String nombre = entrada.next();

                System.out.println("DNI:");
                int DNI = entrada.nextInt();

                System.out.println("Fila:");
                String fila = entrada.next();//ver

                System.out.println("Silla:");
                int silla = entrada.nextInt();

                espectadores[i] = new Espectadores(nombre, DNI, fila,silla);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("ERROR EN EL INGRESO DE DATOS");
                break;
            }
            }while (carga==1);
        
    }
}
