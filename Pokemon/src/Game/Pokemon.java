package Game;


public class Pokemon {

    private int _pokemonID;
    private String _pokemonAdi;
    private String _pokemonTip;
    private Boolean _kartKullanildimi;

    public void setPokemonID(int id) {
        this._pokemonID = id;
    }

    public int getPokemonID() {
        return this._pokemonID;
    }

    public Boolean getKartKullanildimi() {
        return this._kartKullanildimi;
    }

    public void setKartKullanildimi(Boolean kartKullanildimi) {
        this._kartKullanildimi = kartKullanildimi;
    }

    public String getPokemonAdi() {
        return this._pokemonAdi;
    }

    public String getPokemonTip() {
        return this._pokemonTip;
    }

    public Pokemon() {
        this._pokemonAdi = "Tanimsiz";
        this._pokemonTip = "Tanimsiz";
        this._kartKullanildimi = false;

        this._pokemonID = 1;
    }

    public Pokemon(String pokemonAdi, String pokemonTip, int pokemonId) {
        this._pokemonID = pokemonId;
        this._pokemonAdi = pokemonAdi;
        this._pokemonTip = pokemonTip;
        this._kartKullanildimi = false;

    }

    public int hasarPuaniGoster() {
        return 0;
    }
}
