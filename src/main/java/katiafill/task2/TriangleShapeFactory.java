package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class TriangleShapeFactory extends ShapeFactory {
    public static final Logger logger = LoggerFactory.getLogger(TriangleShapeFactory.class.getName());

    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        logger.info("Получены параметры треугольника: " + params);
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

        logger.info("Валидация сторон треугольника.");
        if ( a >= b + c || b >= a + c || c >= a + b ) {
            throw new IllegalArgumentException("Incorrect triangle parameters, the triangle condition is not met.");
        }
    }
}
