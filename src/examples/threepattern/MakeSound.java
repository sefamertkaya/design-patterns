package examples.threepattern;

/**
 * @author sefamertkaya
 */
public class MakeSound implements Command {
    private ToyDuck duck;

    public MakeSound(ToyDuck duck) {
        this.duck = duck;
    }

    @Override
    public void execute() {
        duck.squeak();
    }
}
