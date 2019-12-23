package bridgetv;

/**
 * @author sefamertkaya
 */
public class Client {
    public static void main(String[] args) {
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(100);
        lrc.turnOn();
    }
}
