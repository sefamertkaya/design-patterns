package examples.bridgeexample;

/**
 * @author sefamertkaya
 */
public class Circle extends Shape {
    int x, y, radius;

    public Circle(DrawAPI drawAPI) {
        super(drawAPI);
    }

    @Override
    public void draw() {
        drawAPI.drawCircle();
    }


}
