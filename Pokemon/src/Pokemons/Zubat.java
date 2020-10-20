package Pokemons;

public class Zubat extends Game.Pokemon {

    private int _hasarPuani;

    public Zubat() {
        super("Zubat", "Hava", 10);
        this._hasarPuani = 50;
    }

    public Zubat(int hasarPuani) {
        super("Zubat", "Hava", 10);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
