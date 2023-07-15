package katiafill.task2;

import java.util.List;

public class TriangleShapeFactory extends ShapeFactory {

    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        checkNumberOfParameters(params, 3);

        double a = params.get(0);
        double b = params.get(1);
        double c = params.get(2);
        validateTriangleSides(a, b, c);

        return new Triangle(a, b, c);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new TriangleDescriptionBuilder((Triangle) shape);
    }

    private void validateTriangleSides(double a, double b, double c) throws IllegalArgumentException {
        validate(a);
        validate(b);
        validate(c);

        if ( a >= b + c || b >= a + c || c >= a + b ) {
            throw new IllegalArgumentException("Incorrect triangle parameters, the triangle condition is not met.");
        }
    }
}
