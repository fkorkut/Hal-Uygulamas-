import java.util.List;
import java.util.Scanner;

public class StokTakip {

   static ListelemeIslemleri listelemeIslemleri=new ListelemeIslemleri();
   static SecimIslemleri secimIslemleri=new SecimIslemleri();
   static Scanner  scanner=new Scanner(System.in);

    public static Boolean satisSayisiGuncelle(Urun urun,int satisSayisi,String islem) {
        boolean result=true;
        int satisSonuc;
        if (islem=="+"){
            satisSonuc=urun.getSatisSayisi()+ satisSayisi;
            urun.setSatisSayisi(satisSonuc);
        }
        else if (islem=="-")
        {
            satisSonuc=urun.getSatisSayisi()-satisSayisi;
            if (satisSonuc>0){
                urun.setSatisSayisi(satisSonuc);

            }
            else {
                result=false;
            }
        }
        return  result;

    }

    public static void urunStokGuncelle(List<Urun> listUrun,Urun guncelenecekUrun,int miktar){
        for (Urun urun:listUrun) {
            if (urun.compareTo(guncelenecekUrun)) {
                satisSayisiGuncelle(guncelenecekUrun,miktar,"+");
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

    public static void musteriSatis(Urun urun,Musteri musteri,int satis){
        if (urun.compareTo(urun)){
            boolean kontrol=satisSayisiGuncelle(urun,satis,"-");
            if (kontrol) {
                System.out.println(urun.toString() + " ürününden " + satis + " kadar satıldı.");
            } else {
                System.out.println("Stokta yeterli ürün yok...İşlem geçersiz");
            }
        }

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
        musteriSatis(urun, musteri, stokSayisi);
        listSatis.add(s);
    }


}
