package katiafill.task2;

public enum ShapeType {
    CIRCLE("Круг"),
    RECTANGLE("Прямоугольник"),
    TRIANGLE("Треугольник");

    private final String name;
    ShapeType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static ShapeType fromString(String sType) {
        for (ShapeType type : ShapeType.values()) {
            if (type.name().equalsIgnoreCase(sType)) {
                return type;
            }
        }

        return null;
    }
}
