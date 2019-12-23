package memento;

/**
 * @author sefamertkaya
 */
public class Memento {
    public String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
