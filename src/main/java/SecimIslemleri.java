import java.util.List;
import java.util.Scanner;

//Seçim işlemleri yapıldığı sınıf
public class SecimIslemleri {
    Scanner scanner=new Scanner(System.in);

//    Her işlemde seçim yapılması için liste yollanır
//    Eğer listede eşleşme sağlanır eşleşenin id'si yollanır
//    eşleşme sağlanmıyorsa seçme işleminin tekrar gerçekleşmesi istenir.

    public int personelSec(List<Personel> listPersonel) {
        System.out.println("Urun alacak personel kim");
        int personelGiris = scanner.nextInt();
        for (Personel personel:listPersonel) {
            if (personel.compareTo(personelGiris)){
                return personelGiris;
            }
        }
        return personelSec(listPersonel);
    }


    public int urunSec(List<Urun> listUrun) {
        System.out.println("Hangi urunden almak istersiniz");
        int urunGiris = scanner.nextInt();
        for (Urun urun:listUrun) {
            if (urun.compareTo(urunGiris)){
                return urunGiris;
            }
        }
        return urunSec(listUrun);

    }

    public int musteriSec(List<Musteri> listMusteri) {
        System.out.println("Musteri kim");
        int musteriGiris = scanner.nextInt();
        for (Musteri musteri:listMusteri) {
            if (musteri.compareTo(musteriGiris)){
                return musteriGiris;
            }
        }
        return musteriSec(listMusteri);
    }
}
