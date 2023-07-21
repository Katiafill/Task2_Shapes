package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {
    public static final Logger logger = LoggerFactory.getLogger(Rectangle.class.getName());

    final double width;
    final double length;

    Rectangle(double width, double length) {
        assert(width > 0 && length > 0);
        type = ShapeType.RECTANGLE;

        this.width = width;
        this.length = length;
        logger.info("Создан прямоугольник со сторонами " + width + " и " + length + ".");
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
