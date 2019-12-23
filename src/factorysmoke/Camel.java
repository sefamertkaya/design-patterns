package factorysmoke;

public class Camel extends Sigara {

    public Camel(int fiyat, String adi) {
        super(fiyat, adi);
        System.out.println("Camel üretildi.");
    }
}
