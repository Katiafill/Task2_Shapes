package katiafill.task2.factory;

import katiafill.task2.builder.RectangleDescriptionBuilder;
import katiafill.task2.builder.ShapeDescriptionBuilder;
import katiafill.task2.models.Rectangle;
import katiafill.task2.models.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class RectangleShapeFactory extends ShapeFactory {
    private static final Logger logger = LoggerFactory.getLogger(RectangleShapeFactory.class.getName());

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
