package bridgetv;

/**
 * @author sefamertkaya
 */
public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(int channel) {
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }

}