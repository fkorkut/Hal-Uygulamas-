public class Satis {

 private Urun urun;
 private  Musteri musteri;
 private int satisAdeti;


    public Satis(Urun urun, Musteri musteri, int satisAdeti) {
        this.urun = urun;
        this.musteri = musteri;
        this.satisAdeti = satisAdeti;
    }

    @Override
    public String toString() {
        return "Satis" + "urun=" + urun +", musteri=" + musteri +", satisAdeti=" + satisAdeti ;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public Urun getUrun() {
        return urun;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public int getSatisAdeti() {
        return satisAdeti;
    }

    public void setSatisAdeti(int satisAdeti) {
        this.satisAdeti = satisAdeti;
    }



}
