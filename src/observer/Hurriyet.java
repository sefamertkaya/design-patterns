package observer;

import java.util.ArrayList;

/**
 * @author sefamertkaya
 */
public class Hurriyet implements Gazete {

    private ArrayList<Abone> aboneler = new ArrayList<Abone>();

    @Override
    public void aboneEkle(Abone abone) {
        getAboneler().add(abone);
    }

    @Override
    public void aboneSil(Abone abone) {
        getAboneler().remove(abone);
    }

    @Override
    public void gazeteGonder() {
        for (int i = 0; i < getAboneler().size(); i++) {
            getAboneler().get(i).update();
        }
    }

    public ArrayList<Abone> getAboneler() {
        return aboneler;
    }

    public void setAboneler(final ArrayList<Abone> aboneler) {
        this.aboneler = aboneler;
    }

}
