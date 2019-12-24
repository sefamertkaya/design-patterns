package prototype;

/**
 * @author sefamertkaya
 */
public abstract class Personel {


    protected String personelAdi;

    abstract void personelMesai();

    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;


    }
}
