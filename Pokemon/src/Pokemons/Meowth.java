package Pokemons;

public class Meowth extends Game.Pokemon {

    private int _hasarPuani;
    private Boolean _kartKullanildimi;

    public Meowth() {
        super("Meowth", "Normal", 5);
        this._hasarPuani = 40;
    }

    public Meowth(int hasarPuani) {
        super("Meowth", "Normal", 5);
        this._hasarPuani = hasarPuani;
    }

    @Override
    public int hasarPuaniGoster() {
        return this._hasarPuani;
    }
}
