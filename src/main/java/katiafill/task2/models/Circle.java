package katiafill.task2.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {
    public static final Logger logger = LoggerFactory.getLogger(Circle.class.getName());

    public final double radius;

    public Circle(double radius) {
        assert(radius > 0);
        type = ShapeType.CIRCLE;
        this.radius = radius;
        logger.info("Создан круг с радиусом " + radius + ".");
    }

    public double diameter() {
        return 2 * radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * diameter();
    }

}
