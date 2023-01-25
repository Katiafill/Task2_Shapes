package katiafill.task2;

public class CircleShape extends Shape {
    private final double radius;

    CircleShape(double radius) {
        type = ShapeType.CIRCLE;
        this.radius = radius;
    }

    double diameter() {
        return 2 * radius;
    }

    @Override
    double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return Math.PI * diameter();
    }

    @Override
    String description() {
        DescriptionBuilder builder = new DescriptionBuilder(super.description());

        builder.appendProperty("Радиус", radius);
        builder.appendProperty("Диаметр", diameter());

        return builder.description();
    }
}
