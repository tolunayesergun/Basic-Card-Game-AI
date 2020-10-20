package Pokemons;

public class Butterfree extends Game.Pokemon {

    private int _hasarPuani;

    public Butterfree() {
        super("Butterfree", "Hava", 2);
        this._hasarPuani = 10;
    }

    public Butterfree(int hasarPuani) {
        super("Butterfree", "Hava", 2);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
