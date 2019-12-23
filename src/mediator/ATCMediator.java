package mediator;

/**
 * @author sefamertkaya
 */
public class ATCMediator implements IATCMediator {

    public boolean land;
    private Flight flight;
    private Runway runway;

    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }


    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }

}
