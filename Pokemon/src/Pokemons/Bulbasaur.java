package Pokemons;


public class Bulbasaur extends Game.Pokemon {

    private int _hasarPuani;

    public Bulbasaur() {
        super("Bulbasaur", "Çim", 1);
        this._hasarPuani = 50;
    }

    public Bulbasaur(int hasarPuani) {
        super("Bulbasaur", "Çim", 1);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
