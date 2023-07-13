package katiafill.task2;

public class CircleShapeFactory implements ShapeFactory {

    @Override
    public Shape createShape(String args) {
        String[] params = args.split(" ");
        double radius = Double.parseDouble(params[0]);
        return new Circle(radius);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new CircleDescriptionBuilder((Circle)shape);
    }
}
