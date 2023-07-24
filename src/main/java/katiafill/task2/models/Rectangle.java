package katiafill.task2.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {
    public static final Logger logger = LoggerFactory.getLogger(Rectangle.class.getName());

    public final double width;
    public final double length;

    public Rectangle(double width, double length) {
        assert(width > 0 && length > 0);
        type = ShapeType.RECTANGLE;

        this.width = width;
        this.length = length;
        logger.info("Создан прямоугольник со сторонами " + width + " и " + length + ".");
    }

    @Override
    public double square() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return (width + length) * 2;
    }

    public double diagonal() {
        return Math.sqrt(width * width + length * length);
    }
}
