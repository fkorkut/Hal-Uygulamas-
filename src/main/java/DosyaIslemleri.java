import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public  class DosyaIslemleri {

    public void stoklariDosyayaObjeOlarakYaz(List<Stok> stokList) {

        try (FileOutputStream fileOut = new FileOutputStream(".\\stokObje.txt",false);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);) {
            objectOut.writeObject(stokList);
            System.out.println("Basarili bir sekilde dosyaya yazılmıstır.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Stok> stoklariDosyadanOku() {
        List<Stok> stokList = null;
        try (FileInputStream fileOut = new FileInputStream(".\\stokObje.txt");
             ObjectInputStream objectOut = new ObjectInputStream(fileOut);) {
            stokList = (List<Stok>) objectOut.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return stokList;
    }
}
