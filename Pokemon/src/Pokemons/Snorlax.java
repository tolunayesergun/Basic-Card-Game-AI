package Pokemons;

public class Snorlax extends Game.Pokemon {

    private int _hasarPuani;

    public Snorlax() {
        super("Snorlax", "Normal", 8);
        this._hasarPuani = 30;
    }

    public Snorlax(int hasarPuani) {
        super("Snorlax", "Normal", 8);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
