public class Havuc extends Sebze {
    public Havuc(int id) {
        setUrunId(id);
    }

    public String urunAdi() {
        return "Havuc";
    }

    @Override
    public String toString() {
        return getUrunId()+"-Havuc : ";
    }
}
