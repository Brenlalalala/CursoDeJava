package Pokemones;

public class Pikachu extends Pokemon implements IElectrico{
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ImpacTrueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi PunioTrueno");

    }
}
