package katiafill.task2;

import java.util.List;

public class RectangleShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        checkNumberOfParameters(params, 2);

        double firstSide = params.get(0);
        double secondSide = params.get(1);
        validate(firstSide);
        validate(secondSide);

        // Длинная сторона длина, короткая - ширина.
        return secondSide > firstSide ?
                new Rectangle(firstSide, secondSide) :
                new Rectangle(secondSide, firstSide);
    }

    @Override
    public ShapeDescriptionBuilder createBuilder(Shape shape) {
        return new RectangleDescriptionBuilder((Rectangle)shape);
    }
}
