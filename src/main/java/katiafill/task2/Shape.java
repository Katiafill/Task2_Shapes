package katiafill.task2;

public abstract class Shape {
    ShapeType type;

    String name() {
        return type.name();
    }

    abstract double square();
    abstract double perimeter();

    String description() {
        StringBuilder desc = new StringBuilder(50);

        desc.append("Название: " + name());
        desc.append("Площадь: " + square());
        desc.append("Периметр: " + perimeter());

        return desc.toString();
    }
}
