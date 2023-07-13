package katiafill.task2;

public class Circle extends Shape {
    final double radius;

    Circle(double radius) {
        assert(radius > 0);
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

}
