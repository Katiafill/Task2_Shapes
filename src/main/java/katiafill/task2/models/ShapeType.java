package katiafill.task2.models;

public enum ShapeType {
    CIRCLE("Круг"),
    RECTANGLE("Прямоугольник"),
    TRIANGLE("Треугольник");

    private final String value;
    ShapeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ShapeType fromString(String sType) {
        for (ShapeType type : ShapeType.values()) {
            if (type.name().equalsIgnoreCase(sType)) {
                return type;
            }
        }

        return null;
    }
}
