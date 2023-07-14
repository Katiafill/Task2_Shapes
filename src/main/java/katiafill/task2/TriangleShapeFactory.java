package katiafill.task2;

public class TriangleShapeFactory implements ShapeFactory {

    @Override
    public Shape createShape(String args) {
        String[] params = args.split(" ");
        double a = Double.parseDouble(params[0]);
        double b = Double.parseDouble(params[1]);
        double c = Double.parseDouble(params[1]);
        return new Triangle(a, b, c);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new TriangleDescriptionBuilder((Triangle) shape);
    }
}
