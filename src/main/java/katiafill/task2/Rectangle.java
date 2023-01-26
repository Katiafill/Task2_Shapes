package katiafill.task2;

public class Rectangle extends Shape {

    final double width;
    final double height;

    Rectangle(double width, double height) {
        assert(width > 0 && height > 0);
        type = ShapeType.RECTANGLE;

        // Короткая сторона - ширина, длинная - длина.
        if (width < height) {
            this.width = width;
            this.height = height;
        } else {
            this.width = height;
            this.height = width;
        }
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

    @Override
    String description() {
        DescriptionBuilder builder = new DescriptionBuilder(super.description());

        builder.appendProperty("Длина", height);
        builder.appendProperty("Ширина", width);
        builder.appendProperty("Диагональ", diagonal());

        return builder.description();
    }
}
