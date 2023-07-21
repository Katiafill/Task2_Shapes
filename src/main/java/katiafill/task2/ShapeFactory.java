package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

abstract class ShapeFactory {
    public static final Logger logger = LoggerFactory.getLogger(ShapeFactory.class.getName());

    abstract Shape createShape(List<Double> params) throws IllegalArgumentException;
    abstract ShapeDescriptionBuilder createBuilder(Shape shape);

    protected void checkNumberOfParameters(List<Double> params, int number) throws IllegalArgumentException {
        logger.info("Проверка количества параметров.");
        int size = params.size();
        if (size != number) {
            throw new IllegalArgumentException("Wrong number of parameters " + size + ", should be " + number + ".");
        }
    }

    protected void validate(double param) {
        logger.info("Проверка параметра " + param +" на валидность.");
        if (!Double.isFinite(param)) {
            throw new IllegalArgumentException("Parameter should be number.");
        }

        if (param <= 0) {
            throw new IllegalArgumentException("Parameter should be more 0.");
        }
    }
}

