package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sefamertkaya
 * <p>
 * Originator: Nesnenin nasıl kaydedilip nasıl çekileceğini bilen sınıftır.
 * Memento: Kaydedilecek nesnenin state tutar.
 * CareTaker: Memento nesnesinin versiyonlarını tutan yapıdır.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
