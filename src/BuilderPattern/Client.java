package BuilderPattern;

public class Client {
    public static void main(String[] args) {

        SiparisManager director=new SiparisManager();
        director.createOrder("Audi","R8","Siyah",200);
        director.printOrder();
    }
}
