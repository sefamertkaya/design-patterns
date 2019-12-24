package prototype;

/**
 * @author sefamertkaya
 */
public class IdariPersonel extends Personel {

    public IdariPersonel() {
        this.personelAdi = "İdariPersonel";
    }

    @Override
    void personelMesai() {
        System.out.println("İdari personel mesai bilgi");
    }
}
