public class Elma extends Meyve {

    public String urunAdi() {
        return "Elma";
    }

    public Elma(int id) {
        setUrunId(id);
    }

    @Override
    public String toString() {
        return getUrunId()+"-Elma : ";
    }
}
