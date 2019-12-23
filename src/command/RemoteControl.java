package command;

/**
 * @author sefamertkaya
 */
public class RemoteControl {


    public Command[] key = new Command[2];

    public RemoteControl() {
        final TV tv = new TV();
        key[0] = new TurnOnTV(tv);
        key[1] = new TurnOffTV(tv);
    }

    public void enter(final int i) {
        if (i > key.length || i < 0) {
            throw new RuntimeException("" + "Tuş geçersiz!");
        }
        key[i].execute();
    }


}
