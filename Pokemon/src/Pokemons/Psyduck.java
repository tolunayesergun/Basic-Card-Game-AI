package Pokemons;

public class Psyduck extends Game.Pokemon {

    private int _hasarPuani;

    public Psyduck() {
        super("Psyduck", "Su", 7);
        this._hasarPuani = 20;
    }

    public Psyduck(int hasarPuani) {
        super("Psyduck", "Su", 7);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
