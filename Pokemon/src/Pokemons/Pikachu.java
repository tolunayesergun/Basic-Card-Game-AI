package Pokemons;

public class Pikachu extends Game.Pokemon {

    private int _hasarPuani;

    public Pikachu() {
        super("Pikachu", "Elektrik", 6);
        this._hasarPuani = 40;
    }

    public Pikachu(int hasarPuani) {
        super("Pikachu", "Elektrik", 6);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
