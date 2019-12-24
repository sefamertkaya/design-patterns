package examples.threepattern;

/**
 * @author sefamertkaya
 */
public class Client {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();

        ToyFactory factory = new PlasticToy();
        ToyDuck toyDuck = factory.createToy();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        final RemoteControl rc = new RemoteControl();

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        rc.buzzy();

        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }

}
