import java.io.Serializable;

public class Stok implements Serializable {
    Urun urun;
    Personel personel;
    int stokSayisi;

    public Stok() { }

    public Stok(Urun urun, Personel personel, int stokSayisi) {
        this.urun = urun;
        this.personel = personel;
        this.stokSayisi = stokSayisi;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public int getStokSayisi() {
        return stokSayisi;
    }

    public void setStokSayisi(int stokSayisi) {
        this.stokSayisi = stokSayisi;
    }

    @Override
    public String toString() {
        return "Stok : " +  "  urun=" + urun.toString() + ", personel=" + personel.toString() + ", stokSayisi=" + stokSayisi ;
    }
}