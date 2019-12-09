import java.util.List;
import java.util.Scanner;

public class StokTakip {
   static ListelemeIslemleri listelemeIslemleri=new ListelemeIslemleri();
   static SecimIslemleri secimIslemleri=new SecimIslemleri();
   static Scanner  scanner=new Scanner(System.in);

    public static void urunStokGuncelle(List<Urun> listUrun,Urun guncelenecekUrun,int miktar){
        for (Urun urun:listUrun) {
            if (urun.compareTo(guncelenecekUrun)) {
                guncelenecekUrun.satisSayisiGuncelle(miktar,"+");
                System.out.println("Urunun son stogu: " + guncelenecekUrun.getSatisSayisi());
                break;
            }

        }
    }
    public static void personelStokGuncelle(List<Personel> listpersonel,Personel guncelenecekPersonel,int miktar){
        for (Personel personel:listpersonel) {
            if (personel.compareTo(guncelenecekPersonel)){
                guncelenecekPersonel.setAlisSayisi(miktar);
                System.out.println("Personelin son stogu: "+ guncelenecekPersonel.getAlisSayisi());
                break;
            }

        }
    }

    public static void stokUret(List<Urun> listUrun, List<Personel> listPersonel,List<Stok> listStok, Urun urun, Personel personel) {

        System.out.println("Urunden ne kadar almak istersiniz");
        int stokSayisi = scanner.nextInt();
        Stok stok1 = new Stok(urun, personel, stokSayisi);
        StokTakip.personelStokGuncelle(listPersonel, stok1.personel, stok1.stokSayisi);
        StokTakip.urunStokGuncelle(listUrun, stok1.urun, stok1.stokSayisi);
        listStok.add(stok1);

    }

    public static void musteriBazliStokGuncelleme(List<Urun> listUrun, List<Musteri> listMusteri,List<Satis> listSatis, Urun urun, Musteri musteri) {
        listelemeIslemleri.musteriListe(listMusteri);
        int musteriId = secimIslemleri.musteriSec(listMusteri);
        listelemeIslemleri.urunListe(listUrun);
        int urunId = secimIslemleri.urunSec(listUrun);
        System.out.println("Urunden ne kadar almak istersiniz");
        int stokSayisi = scanner.nextInt();
        for (Urun itemUrun : listUrun) {
            if (itemUrun.compareTo(urunId)) {
                urun = itemUrun;
            }
        }
        for (Musteri itemMusteri : listMusteri) {
            if (itemMusteri.compareTo(musteriId)) {
                musteri = itemMusteri;
            }
        }

        Satis s = new Satis(urun, musteri, stokSayisi);
        s.musteriSatis(urun, musteri, stokSayisi);
        listSatis.add(s);
    }


}
