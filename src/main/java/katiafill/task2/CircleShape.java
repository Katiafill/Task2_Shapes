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
        StringBuilder desc = new StringBuilder(100);

        desc.append(super.description());
        desc.append("Радиус: " + radius);
        desc.append("Диаметр: " + diameter());

        return desc.toString();
    }
}
