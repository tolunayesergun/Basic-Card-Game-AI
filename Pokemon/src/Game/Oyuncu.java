
package Game;

import Game.Pokemon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public abstract class Oyuncu {
    private int _oyuncuID;
    private String _oyuncuAdi;
    private int _skor;
    private List<Pokemon> _kartListesi;
    
    public int getOyuncuId()
    {
        return this._oyuncuID;
    }
    
    public String getOyuncuAdi()
    {
        return this._oyuncuAdi;
    }
    
    public void setOyuncuId(int oyuncuId)
    {
        this._oyuncuID = oyuncuId;
    }
    
    public void setOyuncuAdi(String oyuncuAdi)
    {
        this._oyuncuAdi = oyuncuAdi;
    }
    
    public void setSkor(int skor)
    {
        this._skor = skor;
    }
    
    public List<Pokemon> getKartList()
    {
        return this._kartListesi;
    }
    
    public void listeyeKartEkle(Pokemon kart)
    {
        this._kartListesi.add(kart);
    }
    
    public int SkorGoster()
    {
        return this._skor;
    }
    
    public Oyuncu()
    {
        this._kartListesi = new ArrayList<>();
    }
    
    public Oyuncu(int oyuncuId, String oyuncuAdi, int skor)
    {
        this._oyuncuID = oyuncuId;
        this._oyuncuAdi = oyuncuAdi;
        this._skor = skor;
        this._kartListesi = new ArrayList<>();
    }
    
    abstract Pokemon kartSec(Pokemon selectedCard);
}
