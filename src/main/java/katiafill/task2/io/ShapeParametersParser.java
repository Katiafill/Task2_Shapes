package katiafill.task2.io;

import katiafill.task2.models.ShapeType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeParametersParser {

    private final ShapeType type;
    private final List<Double> parameters;

    public ShapeParametersParser(List<String> params) throws IllegalArgumentException {
        checkNumberOfParameters(params);
        type = getShapeType(params.get(0));
        parameters = getShapeParameters(params.get(1));
    }

    public ShapeType getType() {
        return type;
    }

    public List<Double> getParameters() {
        return parameters;
    }

    private void checkNumberOfParameters(List<String> params) throws IllegalArgumentException {
        if (params.size() != 2) {
            throw new IllegalArgumentException("Incorrect parameters.");
        }
    }

    private ShapeType getShapeType(String sType) {
        final ShapeType type = ShapeType.fromString(sType);
        if (type == null) {
            throw new IllegalArgumentException("Incorrect shape type - " + sType);
        }
        return type;
    }

    private List<Double> getShapeParameters(String params) {
        return Arrays.stream(params.split("\\s+"))
                .map(Double::valueOf)
                .collect(Collectors.toList());
    }
}
