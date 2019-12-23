package bridgetv;

/**
 * @author sefamertkaya
 */
public class SamsungTV implements ITV {
    @Override
    public void on() {
        System.out.println("Samsung : Turn on");
    }

    @Override
    public void off() {
        System.out.println("Samsung : Turn off");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Samsung : channel - " + channel);
    }
}
