package decorator;

/**
 * @author sefamertkaya
 */
public class Client {
    public static void main(String[] args) {

        ShapeDecorator shape = new RedShapeDecorator(new Rectangle());
        shape.draw();


    }
}
