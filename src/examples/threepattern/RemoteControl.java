package examples.threepattern;

/**
 * @author sefamertkaya
 */
public class RemoteControl {

    public Command[] key = new Command[1];

    public RemoteControl() {
        final ToyDuck duck = new PlasticToyDuck();
        key[0] = new MakeSound(duck);
        this.key = key;
    }

    public void buzzy() {
        key[0].execute();
    }
}
