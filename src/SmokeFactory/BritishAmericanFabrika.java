package SmokeFactory;

public class BritishAmericanFabrika extends SigaraFabrika {

    @Override
    public Sigara sigaraUret() {
        return new Camel(15,"Camel");
    }
}
