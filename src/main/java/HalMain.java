import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HalMain {
    static Scanner scanner = new Scanner(System.in);
    static List<Stok> listStok = new ArrayList<>();
    static List<Satis> listSatis=new ArrayList<>();

    public static void main(String[] args) {
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

        Musteri musteri1 = new Musteri(1,"Mehmet");
        listMusteri.add(musteri1);
        Musteri musteri2 = new Musteri(2,"Mücahit");
        listMusteri.add(musteri2);

        System.out.println("Sisteme Hoşgeliginiz.");
        while (true) {
            int islemSecimi = anaMenu();
            switch (islemSecimi) {
                case 1://Stok güncelleme
                    personelListe(listPersonel);
                    int personelId = personelSec(listPersonel);//öncelikle personel seçimi
                    int urunId;
                    switch (personelId) { //secilen personel
                        case 1:
                            urunListe(listUrun);
                            urunId = urunSec(listUrun);
                            switch (urunId) {//personele göre ürün seçimi
                                case 1:
                                    stokUret(listUrun, listPersonel, urun1, personel1);
                                    break;
                                case 2:
                                    stokUret(listUrun, listPersonel, urun2, personel1);
                                    break;

                            }
                            break;
                        case 2:
                            urunId = urunSec(listUrun);
                            switch (urunId) {//personele göre ürün seçimi
                                case 1:
                                    stokUret(listUrun, listPersonel, urun1, personel2);
                                    break;
                                case 2:
                                    stokUret(listUrun, listPersonel, urun2, personel2);
                                    break;

                            }
                            break;

                    }
                    break;
                case 2://personel stogu
                    personelListe(listPersonel);
                    break;
                case 3://ürün stoğu
                    urunListe(listUrun);
                    break;
                case 4:
                    musteriBazliStokGuncelleme(listUrun,listMusteri,urun1,musteri1);
                    break;
                case 5:
                    satisListe(listSatis);
                    break;
                case 6:
                    break;

            }
        }
    }

    private static int anaMenu() {
        System.out.println();
        System.out.println("----------------");
        System.out.println("Hangi işlemi yapmak istersiniz?");
        System.out.println("1.Personel bazlı stok güncelleme");
        System.out.println("2.Personel stokları");
        System.out.println("3.Ürün stokları");
        System.out.println("4.Müsteri bazlı stok güncelleme");
        System.out.println("5.Satışları görüntüle");
        System.out.println("6.Çıkış");

        int secim = scanner.nextInt();
        return secim;
    }

    private static void personelListe(List<Personel> listPersonel) {
        for (Personel personel : listPersonel) {
            System.out.println(personel.toString() + ": " + personel.getAlisSayisi());
        }
    }

    private static void musteriListe(List<Musteri> listMusteri) {
        for (Musteri musteri : listMusteri) {
            System.out.println(musteri.toString() + ": " + musteri.getAlisSayisi());
        }
    }

    private static void urunListe(List<Urun> listUrun) {
        for (Urun urun : listUrun) {
            System.out.println(urun.toString() + "" + urun.getSatisSayisi());
        }
    }

    private  static  void satisListe(List<Satis> listSatis){
        for (Satis satis:listSatis) {
            System.out.println(satis.toString());
        }
    }

    private static int personelSec(List<Personel> listPersonel) {
        System.out.println("Urun alacak personel kim");
        int personelGiris = scanner.nextInt();
        return personelGiris;
    }

    private static int urunSec(List<Urun> listUrun) {
        System.out.println("Hangi urunden almak istersiniz");
        int urunGiris = scanner.nextInt();
        return urunGiris;
    }

    private static int musteriSec(List<Musteri> listMusteri) {
        System.out.println("Musteri kim");
        int musteriGiris = scanner.nextInt();
        return musteriGiris;
    }

    private static void stokUret(List<Urun> listUrun, List<Personel> listPersonel, Urun urun, Personel personel) {

        System.out.println("Urunden ne kadar almak istersiniz");
        int stokSayisi = scanner.nextInt();
        Stok stok1 = new Stok(urun, personel, stokSayisi);
        StokTakip.personelStokGuncelle(listPersonel, stok1.personel, stok1.stokSayisi);
        StokTakip.urunStokGuncelle(listUrun, stok1.urun, stok1.stokSayisi);
        listStok.add(stok1);

    }

    private static void musteriBazliStokGuncelleme(List<Urun> listUrun, List<Musteri> listMusteri,Urun urun,Musteri musteri) {
        musteriListe(listMusteri);
        int musteriId = musteriSec(listMusteri);
        urunListe(listUrun);
        int urunId = urunSec(listUrun);
        System.out.println("Urunden ne kadar almak istersiniz");
        int stokSayisi = scanner.nextInt();
        for (Urun itemUrun : listUrun) {
            if (itemUrun.compareTo(urunId)) {
                urun=itemUrun;
            }
        }
        for (Musteri itemMusteri : listMusteri) {
            if (itemMusteri.compareTo(musteriId)) {
                musteri=itemMusteri;
            }
        }

        Satis s = new Satis(urun, musteri, stokSayisi);
        s.musteriSatis(urun, musteri, stokSayisi);
        listSatis.add(s);
    }





}

