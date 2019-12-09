import java.util.List;

public class ListelemeIslemleri {
    public  void personelListe(List<Personel> listPersonel) {
        for (Personel personel : listPersonel) {
            System.out.println(personel.toString() + ": " + personel.getAlisSayisi());
        }
    }

    public  void musteriListe(List<Musteri> listMusteri) {
        for (Musteri musteri : listMusteri) {
            System.out.println(musteri.toString() + ": " + musteri.getAlisSayisi());
        }
    }

    public  void urunListe(List<Urun> listUrun) {
        for (Urun urun : listUrun) {
            System.out.println(urun.toString() + "" + urun.getSatisSayisi());
        }
    }

    public    void satisListe(List<Satis> listSatis){
        for (Satis satis:listSatis) {
            System.out.println(satis.toString());
        }
    }
}
