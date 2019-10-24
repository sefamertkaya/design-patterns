package SmokeFactory;

public class PhilipMorrisFabrika extends SigaraFabrika{

    @Override
    public Sigara sigaraUret() {
        return new Parliement(20,"Parliement");
    }

}
