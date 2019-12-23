package memento;

/**
 * @author sefamertkaya
 */
public class Main {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("#1 state");
        originator.setState("#2 state");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#3 state");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("#4 state");
        System.out.println("Current state: " + originator.getState());
        originator.getStateToMemento(careTaker.get(0));
        System.out.println("First state: " + originator.getState());


    }
}
