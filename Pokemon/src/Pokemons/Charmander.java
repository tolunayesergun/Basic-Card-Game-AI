package Pokemons;

public class Charmander extends Game.Pokemon {

    private int _hasarPuani;

    public Charmander() {
        super("Charmander", "Ateş", 3);
        this._hasarPuani = 60;
    }

    public Charmander(int hasarPuani) {
        super("Charmander", "Ateş", 3);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
