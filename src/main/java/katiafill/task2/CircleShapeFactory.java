package katiafill.task2;

import java.util.List;

public class CircleShapeFactory extends ShapeFactory {

    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        checkNumberOfParameters(params, 1);

        double radius = params.get(0);
        validate(radius);

        return new Circle(radius);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new CircleDescriptionBuilder((Circle)shape);
    }
}
