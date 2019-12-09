public class Stok {
    Urun urun;
    Personel personel;
    int stokSayisi;

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

    public Stok(Urun urun, Personel personel, int stokSayisi) {
        this.urun = urun;
        this.personel = personel;
        this.stokSayisi = stokSayisi;
    }


}