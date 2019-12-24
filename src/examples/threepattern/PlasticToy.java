package examples.threepattern;

/**
 * @author sefamertkaya
 */
public class PlasticToy extends ToyFactory {
    @Override
    public ToyDuck createToy() {
        return new PlasticToyDuck();
    }
}
