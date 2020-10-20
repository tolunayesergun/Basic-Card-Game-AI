package Pokemons;

public class Squirtle extends Game.Pokemon {

    private int _hasarPuani;

    public Squirtle() {
        super("Squirtle", "Su", 9);
        this._hasarPuani = 30;
    }

    public Squirtle(int hasarPuani) {
        super("Squirtle", "Su", 9);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
