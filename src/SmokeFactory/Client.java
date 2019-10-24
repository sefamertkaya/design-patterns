package SmokeFactory;

public class Client {
    public static void main(String[] args) {

        SigaraFabrika parliementFabrisko=new PhilipMorrisFabrika();
        SigaraFabrika camelFabrisko=new BritishAmericanFabrika();
        camelFabrisko.sigaraUret();
        parliementFabrisko.sigaraUret();


    }
}
