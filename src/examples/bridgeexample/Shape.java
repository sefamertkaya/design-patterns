package examples.bridgeexample;

/**
 * @author sefamertkaya
 */
public abstract class Shape {
    public DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract public void draw();

}
