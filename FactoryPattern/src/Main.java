import Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();
        shape = shapeFactory.getShape("rectangle");
        shape.draw();
    }
}