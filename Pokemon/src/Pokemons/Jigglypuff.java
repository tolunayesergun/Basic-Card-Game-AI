package Pokemons;

public class Jigglypuff extends Game.Pokemon {

    private int _hasarPuani;

    public Jigglypuff() {
        super("Jigglypuff", "Ses", 4);
        this._hasarPuani = 70;
    }

    public Jigglypuff(int hasarPuani) {
        super("Jigglypuff", "Ses", 4);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
