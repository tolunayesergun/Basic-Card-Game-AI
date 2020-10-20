package Game;

import Game.Oyuncu;
import Game.Pokemon;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
        super(2, "Bilgisayar 1", 0);
    }

    public Bilgisayar(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

    public int _lastCardIndex;

    public int getLastCardIndex() {
        return this._lastCardIndex;
    }

    @Override
    Pokemon kartSec(Pokemon selectedCard) {
        Random rand = new Random();
        int index = 0;

        List<Pokemon> pokelist = new ArrayList();
        for (Pokemon poke : super.getKartList()) {
            if (poke.getKartKullanildimi() == false) {
                pokelist.add(poke);
            }
        }

        index = rand.nextInt(pokelist.size());
        Pokemon pokemon = pokelist.get(index);

        int tempCount = 0;
        for (Pokemon subPoke : super.getKartList()) {
            if (subPoke.getPokemonID() == pokemon.getPokemonID()) {
                break;
            }

            tempCount++;
        }

        this._lastCardIndex = tempCount;

        return pokemon;
    }
}
