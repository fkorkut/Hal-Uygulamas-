import java.util.List;

public class StokTakip {
    public static void urunStokGuncelle(List<Urun> listUrun,Urun guncelenecekUrun,int miktar){
        for (Urun urun:listUrun) {
            if (urun.compareTo(guncelenecekUrun)) {
                guncelenecekUrun.setSatisSayisi(miktar);
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
}
