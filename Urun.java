import java.io.Serializable;
import java.util.Random;

public abstract class Urun implements Serializable {
    private int urunId;
    private int urunFiyat;
    private EnumMiktarTuru miktar;
    private int satisSayisi;

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public int getSatisSayisi() {
        return satisSayisi;
    }

    public void setSatisSayisi(int satisSayisi) {
        this.satisSayisi =satisSayisi;
    }

    public int getUrunFiyat() {
        return urunFiyat;
    }

    public void setUrunFiyat(int urunFiyat) {
        this.urunFiyat = urunFiyat;
    }

    public EnumMiktarTuru getMiktar() {
        return miktar;
    }

    public void setMiktar(EnumMiktarTuru miktar) {
        this.miktar = miktar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Urun urun = (Urun) o;
        return urunId == urun.urunId;
    }

    public boolean compareTo(Object o) {
        Urun urun = (Urun) o;
        int id = urun.getUrunId();
        int varolanId = this.getUrunId();
        if (id < varolanId) return false;
        else if (id > varolanId) return false;
        else return true;
    }


    public boolean compareTo(int urunId) {

        int varolanId = this.getUrunId();
        if (urunId < varolanId) return false;
        else if (urunId > varolanId) return false;
        else return true;
    }





}
