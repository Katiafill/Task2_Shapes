package katiafill.task2.models;

public abstract class Shape {
    protected ShapeType type;

    public String name() {
        return type.getValue();
    }

    public abstract double square();
    public abstract double perimeter();
}
