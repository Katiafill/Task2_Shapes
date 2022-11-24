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
}
