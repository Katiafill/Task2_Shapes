package katiafill.task2;

public abstract class Shape {
    protected ShapeType type;

    String name() {
        return type.getName();
    }

    abstract double square();
    abstract double perimeter();
}
