package Pokemones;

public class Squirtle extends Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolagua() {
        System.out.println("Hola soy Squirtle y este es mi ataque PistolaDeAgua");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {

    }
}
