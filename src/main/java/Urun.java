import java.util.Random;

public abstract class Urun {
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
        this.satisSayisi =getSatisSayisi()+ satisSayisi;
    }
    public Boolean setSatisSayisi(int satisSayisi,String islem) {
        boolean result=true;
        if (islem=="+"){
            this.satisSayisi =getSatisSayisi()+ satisSayisi;
        }
        else if (islem=="-")
        {
            int satis=getSatisSayisi()-satisSayisi;
            if (satis>0){
                this.satisSayisi=satis;

            }
            else {
                result=false;
            }
        }
        return  result;

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


    public abstract String urunAdi();
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
}
