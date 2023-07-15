package katiafill.task2;

public class Rectangle extends Shape {

    final double width;
    final double length;

    Rectangle(double width, double length) {
        assert(width > 0 && length > 0);
        type = ShapeType.RECTANGLE;

        this.width = width;
        this.length = length;
    }

    @Override
    double square() {
        return width * length;
    }

    @Override
    double perimeter() {
        return (width + length) * 2;
    }

    double diagonal() {
        return Math.sqrt(width * width + length * length);
    }

}
