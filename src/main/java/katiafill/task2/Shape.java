package katiafill.task2;

public abstract class Shape {
    ShapeType type;

    String name() {
        return type.getName();
    }

    abstract double square();
    abstract double perimeter();

    String description() {
        DescriptionBuilder builder = new DescriptionBuilder();

        builder.appendProperty("Название", name());
        builder.appendProperty("Площадь", square());
        builder.appendProperty("Периметр", perimeter());

        return builder.description();
    }
}
