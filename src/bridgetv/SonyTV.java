package bridgetv;

/**
 * @author sefamertkaya
 */
public class SonyTV implements ITV {
    @Override
    public void on() {
        System.out.println("Sony : Turn on");
    }

    @Override
    public void off() {
        System.out.println("Sony : Turn off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony : channel - " + channel);
    }
}
