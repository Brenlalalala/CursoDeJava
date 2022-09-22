public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo= new Vehiculo("56g", "Toyata", "Tunning");
        Vehiculo vehiculo1= new VehiculoDeportivo("56", "Twister", "a24", 150);
        System.out.println(vehiculo.mostarDatos()+vehiculo1.mostarDatos());

//se puede crear un arreglo para mostar todos juntos de una vez con un for

        Vehiculo misVehiculos[] = new Vehiculo[4];

         misVehiculos[0] = new Vehiculo("12gb", "Ferrari", "A8");
         misVehiculos[1] = new VehiculoTurismo("12gbc", "Ferrary", "A8b", 4);
         misVehiculos[2]= new Vehiculo("15gb", "Ford", "P0");
         misVehiculos[3]= new VehiculoDeportivo("15bc", "Renault", "204", 4);

         for(Vehiculo x: misVehiculos){//nombre de la clase, cualquier variable: el arreglo
             System.out.println(x.mostarDatos());
         }
    }

}
