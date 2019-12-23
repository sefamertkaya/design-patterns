package command;

/**
 * @author sefamertkaya
 */
public class TurnOnTV implements Command {

    private TV tv = null;

    public TurnOnTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();

    }
}
