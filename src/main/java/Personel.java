public class Personel {


    private int personelId;
    private String personelAdi;
    private  int alisSayisi;

    public int getAlisSayisi() {
        return alisSayisi;
    }

    public void setAlisSayisi(int alisSayisi) {
        this.alisSayisi =getAlisSayisi()+alisSayisi;
    }

    public Personel(int personelId, String personelAdi,int alisSayisi) {
        this.personelAdi = personelAdi;
        this.personelId=personelId;
        this.alisSayisi=alisSayisi;
    }
    public void setPersonelId(int personelId) {
        this.personelId = personelId;
    }

    @Override
    public String toString() {
        return "Personel Adi='" + personelAdi + '\''+" "+personelId;
    }


    @Override
    public boolean equals(Object o) {
        Personel personel = (Personel) o;
        return this.personelId == personel.getPersonelId();
    }


    public boolean compareTo(Object o) {
        Personel personel = (Personel) o;
        int id = personel.getPersonelId();
        int varolanId = this.getPersonelId();
        if (id < varolanId) return false;
        else if (id > varolanId) return false;
        else return true;
    }

    public int getPersonelId() {
        return personelId;
    }



    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }
}
