package factorysmoke;

public class Sigara {

    private int Fiyat=0;
    private String Adi=null;


    public Sigara(int fiyat, String adi) {
        Fiyat = fiyat;
        Adi = adi;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int fiyat) {
        Fiyat = fiyat;
    }

    public String getAdi() {
        return Adi;
    }

    public void setAdi(String adi) {
        Adi = adi;
    }
}
