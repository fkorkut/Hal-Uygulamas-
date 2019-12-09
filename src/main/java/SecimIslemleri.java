import java.util.List;
import java.util.Scanner;

public class SecimIslemleri {
    Scanner scanner=new Scanner(System.in);

    public int personelSec(List<Personel> listPersonel) {
        System.out.println("Urun alacak personel kim");
        int personelGiris = scanner.nextInt();
        return personelGiris;
    }

    public int urunSec(List<Urun> listUrun) {
        System.out.println("Hangi urunden almak istersiniz");
        int urunGiris = scanner.nextInt();
        return urunGiris;
    }

    public int musteriSec(List<Musteri> listMusteri) {
        System.out.println("Musteri kim");
        int musteriGiris = scanner.nextInt();
        return musteriGiris;
    }
}
