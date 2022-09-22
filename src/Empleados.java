public class Empleados extends Persona{
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private double sueldo;

    public Empleados(String nombre, int DNI, double sueldo) {
        super(nombre, DNI);
        this.sueldo = sueldo;
    }
}
