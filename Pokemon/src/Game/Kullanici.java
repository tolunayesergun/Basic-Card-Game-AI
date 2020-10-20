package Game;

import Game.Oyuncu;
import Game.Pokemon;


public class Kullanici extends Oyuncu {

    private Pokemon _seciliPokemon;

    public void setSeciliPokemon(Pokemon pokemon) {
        this._seciliPokemon = pokemon;
    }

    public Pokemon getSeciliPokemon() {
        return this._seciliPokemon;
    }

    public Kullanici() {
        super(1, "Kullanici 1", 0);
    }

    public Kullanici(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

    @Override
    Pokemon kartSec(Pokemon selectedCard) {

        return selectedCard;
    }
}
