package prototype;

/**
 * @author sefamertkaya
 */
public class EgitimPersoneli extends Personel {

    public EgitimPersoneli() {
        this.personelAdi = "EgitimPersonel";
    }

    @Override
    void personelMesai() {
        System.out.println("İdari personel mesai bilgi");

    }
}
