package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

public class CircleShapeFactory extends ShapeFactory {
    public static final Logger logger = LoggerFactory.getLogger(CircleShapeFactory.class.getName());

    @Override
    public Shape createShape(List<Double> params) throws IllegalArgumentException {
        logger.info("Получены параметры круга: " + params);
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
