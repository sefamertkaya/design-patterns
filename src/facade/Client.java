package facade;

/**
 * @author sefamertkaya
 */
public class Client {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }
}
