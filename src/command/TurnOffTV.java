package command;

/**
 * @author sefamertkaya
 */
public class TurnOffTV implements Command {
    private TV tv = null;

    public TurnOffTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }
}
