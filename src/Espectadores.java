public class Espectadores extends Persona {
    private char fila;
    private int silla;


    public Espectadores(String nombre, int DNI, char fila, int silla) {
        super(nombre, DNI);
        this.fila = fila;
        this.silla = silla;
    }
}
