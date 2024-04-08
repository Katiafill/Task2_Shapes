package katiafill.task2.models;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Triangle extends Shape {
    private static final Logger logger = LoggerFactory.getLogger(Triangle.class.getName());

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double a, double b, double c) {
        assert(a > 0 && b > 0 && c > 0);

        type = ShapeType.TRIANGLE;
        sideA = a;
        sideB = b;
        sideC = c;
        logger.info("Создан треугольник с сторонами " + a + ", " + b + ", " + c + ".");
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double angleABC() {
        return angle(sideA, sideB, sideC);
    }

    public double angleBCA() {
        return angle(sideB, sideC, sideA);
    }

    public double angleCAB() {
        return  angle(sideC, sideA, sideB);
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    private double angle(double a, double b, double c) {
        return Math.acos((a * a + b * b - c * c) / (2 * a * b)) * (180 / Math.PI);
    }
}
