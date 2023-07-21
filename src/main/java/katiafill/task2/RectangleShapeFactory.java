package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class RectangleShapeFactory extends ShapeFactory {
    public static final Logger logger = LoggerFactory.getLogger(RectangleShapeFactory.class.getName());

    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        logger.info("Получены параметры прямоугольника: " + params);
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
