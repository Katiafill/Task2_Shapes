package katiafill.task2;

public class Rectangle extends Shape {

    final double width;
    final double height;

    Rectangle(double width, double height) {
        assert(width > 0 && height > 0);
        type = ShapeType.RECTANGLE;

        this.width = width;
        this.height = height;
    }

    @Override
    double square() {
        return width * height;
    }

    @Override
    double perimeter() {
        return (width + height) * 2;
    }

    double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

}
