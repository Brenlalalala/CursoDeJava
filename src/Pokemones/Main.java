package Pokemones;

public class Main {
    public static void main(String[] args) {

        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();
        squirtle.atacarAraniazo();
        squirtle.atacarBurbuja();

    }
}