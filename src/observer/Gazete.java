package observer;

/**
 * @author sefamertkaya
 */
public interface Gazete {

    void aboneEkle(Abone abone);

    void aboneSil(Abone abone);

    void gazeteGonder();

}
