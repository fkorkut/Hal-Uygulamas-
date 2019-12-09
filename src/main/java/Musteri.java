import java.util.List;

public class Musteri {
    private int personelId;
    private String personelAdi;
    private  int alisSayisi;

    public Musteri(int personelId, String personelAdi) {
        this.personelId = personelId;
        this.personelAdi = personelAdi;
    }

    public int getPersonelId() {
        return personelId;
    }

    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public int getAlisSayisi() {
        return alisSayisi;
    }

    public void setAlisSayisi(int alisSayisi) {
        this.alisSayisi = alisSayisi;
    }

    public static void urunListele(List<Stok> stokList){
        for (Stok urunler:stokList) {
            System.out.println(stokList);
        }
    }

    @Override
    public String toString() {
        return "Musteri :" + " Id=" + personelId +  ", Adi='" + personelAdi ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musteri musteri = (Musteri) o;
        return personelId == musteri.personelId;
    }

    public boolean compareTo(Object o) {
        Musteri musteri = (Musteri) o;
        int id = musteri.getPersonelId();
        int varolanId = this.getPersonelId();
        if (id < varolanId) return false;
        else if (id > varolanId) return false;
        else return true;
    }


    public boolean compareTo(int musteriId) {

        int varolanId = this.getPersonelId();
        if (musteriId < varolanId) return false;
        else if (musteriId > varolanId) return false;
        else return true;
    }



}
