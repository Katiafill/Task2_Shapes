package katiafill.task2;

import java.util.List;

abstract class ShapeFactory {
    abstract Shape createShape(List<Double> params) throws IllegalArgumentException;
    abstract ShapeDescriptionBuilder createBuilder(Shape shape);

    protected void checkNumberOfParameters(List<Double> params, int number) throws IllegalArgumentException {
        int size = params.size();
        if (size != number) {
            throw new IllegalArgumentException("Wrong number of parameters " + size + ", should be " + number + ".");
        }
    }

    protected void validate(double param) {
        if (!Double.isFinite(param)) {
            throw new IllegalArgumentException("Parameter should be number.");
        }

        if (param <= 0) {
            throw new IllegalArgumentException("Parameter should be more 0.");
        }
    }
}

