package katiafill.task2;

public class Triangle extends Shape {

    final double sideA;
    final double sideB;
    final double sideC;

    Triangle(double a, double b, double c) {
        assert(a > 0 && b > 0 && c > 0);
        // Условие треугольника
        assert(a + b > c);
        assert(a + c > b);
        assert(b + c > a);

        type = ShapeType.TRIANGLE;
        sideA = a;
        sideB = b;
        sideC = c;
    }

    double angleABC() {
        return angle(sideA, sideB, sideC);
    }

    double angleBCA() {
        return angle(sideB, sideC, sideA);
    }

    double angleACB() {
        return  angle(sideA, sideC, sideB);
    }

    @Override
    double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }

    private double angle(double a, double b, double c) {
        return Math.acos((a * a + b * b - c * c) / (2 * a * b));
    }
}
