package mediator;

/**
 * @author sefamertkaya
 */
public class Flight implements Command {

    private IATCMediator atcMediator;

    public Flight(IATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Sucessfully Landed");
        } else {
            System.out.println("Waiting for landing..");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing.");
    }

}
