package decorator;

/**
 * @author sefamertkaya
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setBorderShape(decoratorShape);
    }

    private void setBorderShape(Shape decoratedShape) {
        System.out.println("Border color:red");
    }

}
