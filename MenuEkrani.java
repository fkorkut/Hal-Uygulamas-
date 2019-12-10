import java.util.Scanner;

public class MenuEkrani {
    public int anaMenu() {
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.println("----------------");
        System.out.println("Hangi işlemi yapmak istersiniz?");
        System.out.println("1.Personel bazlı stok güncelleme");
        System.out.println("2.Personel stokları");
        System.out.println("3.Ürün stokları");
        System.out.println("4.Müsteri bazlı stok güncelleme");
        System.out.println("5.Satışları görüntüle");
        System.out.println("6.Stokların güncel halini kaydet.");
        System.out.println("7.Stokları güncel halini kaydet.");
        System.out.println("8.Çıkış");

        int secim = scanner.nextInt();
        return secim;
    }

}
