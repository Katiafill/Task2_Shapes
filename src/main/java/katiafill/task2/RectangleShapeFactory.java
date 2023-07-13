package katiafill.task2;

public class RectangleShapeFactory implements ShapeFactory {
    @Override
    public Shape createShape(String args) {
        String[] params = args.split(" ");
        double width = Double.parseDouble(params[0]);
        double height = Double.parseDouble(params[1]);
        return new Rectangle(width, height);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new RectangleDescriptionBuilder((Rectangle)shape);
    }
}
