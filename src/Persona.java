public class Persona {
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    private int DNI;

    public Persona(String nombre, int DNI) {
        Nombre = nombre;
        this.DNI = DNI;
    }
}
