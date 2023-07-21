package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle extends Shape {
    public static final Logger logger = LoggerFactory.getLogger(Circle.class.getName());

    final double radius;

    Circle(double radius) {
        assert(radius > 0);
        type = ShapeType.CIRCLE;
        this.radius = radius;
        logger.info("Создан круг с радиусом " + radius + ".");
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
