import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MenuEkrani menuEkrani = new MenuEkrani();

        ListelemeIslemleri listelemeIslemleri = new ListelemeIslemleri();
        SecimIslemleri secimIslemleri = new SecimIslemleri();
        DosyaIslemleri dosyaIslemleri = new DosyaIslemleri();

        List<Stok> listStok = new ArrayList<>();
        List<Satis> listSatis = new ArrayList<>();
        List<Personel> listPersonel = new ArrayList<>();
        List<Urun> listUrun = new ArrayList<>();
        List<Musteri> listMusteri = new ArrayList<>();

        Personel personel1 = new Personel(1, "Ali", 0);
        listPersonel.add(personel1);
        Personel personel2 = new Personel(2, "Veli", 0);
        listPersonel.add(personel2);


        Urun urun1 = new Elma(1);
        listUrun.add(urun1);
        Urun urun2 = new Havuc(2);
        listUrun.add(urun2);

        Musteri musteri1 = new Musteri(1, "Mehmet");
        listMusteri.add(musteri1);
        Musteri musteri2 = new Musteri(2, "Mücahit");
        listMusteri.add(musteri2);

        System.out.println("Sisteme Hoşgeldiniz.");

        boolean islemYapilsinMi=true;

        while (islemYapilsinMi) {
            int islemSecimi = menuEkrani.anaMenu();
            switch (islemSecimi) {
                case 1://Stok güncelleme
                    listelemeIslemleri.personelListe(listPersonel);
                    int personelId = secimIslemleri.personelSec(listPersonel);//öncelikle personel seçimi
                    Personel personel = null;
                    for (Personel itemPersonel : listPersonel) {
                        if (itemPersonel.compareTo(personelId)) {
                            personel = itemPersonel;
                        }
                    }
                    listelemeIslemleri.urunListe(listUrun);
                    int urunId = secimIslemleri.urunSec(listUrun);
                    Urun urun = null;
                    for (Urun itemUrun : listUrun) {
                        if (itemUrun.compareTo(urunId)) {
                            urun = itemUrun;
                        }
                    }
                    StokTakip.stokUret(listUrun, listPersonel, listStok, urun, personel);
                case 2://personel stogu
                    listelemeIslemleri.personelListe(listPersonel);
                    break;
                case 3://ürün stoğu
                    listelemeIslemleri.urunListe(listUrun);
                    break;
                case 4://müşteri işlemi
                    StokTakip.musteriBazliStokGuncelleme(listUrun, listMusteri, listSatis, urun1, musteri1);
                    break;
                case 5://müsteri işlemlerini görüntüle
                    listelemeIslemleri.satisListe(listSatis);
                    break;
                case 6://dosyaya yazdırma
                    dosyaIslemleri.stoklariDosyayaObjeOlarakYaz(listStok);
                    break;
                case 7://dosyadan okuma
                    List<Stok> dosyaListStok = dosyaIslemleri.stoklariDosyadanOku();
                    for (Stok stok : dosyaListStok) {
                        System.out.println(stok.toString());
                    }
                    break;
                case 8:
                    islemYapilsinMi=false;
                    break;
            }
        }
    }
}

