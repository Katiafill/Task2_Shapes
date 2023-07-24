package katiafill.task2;

import katiafill.task2.models.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void angles() {
        Triangle shape = new Triangle(3, 4, 5);

        checkAngle(shape.angleABC(), 90.0);
        checkAngle(shape.angleBCA(), 36.87);
        checkAngle(shape.angleCAB(), 53.13);
    }

    @Test
    void square() {
        Triangle shape = new Triangle(3, 4, 5);
        assertEquals(shape.square(), 6);
    }

    @Test
    void perimeter() {
        Triangle shape = new Triangle(3, 4, 5);
        assertEquals(shape.perimeter(), 12);
    }


    private void checkAngle(double expected, double actual) {
        String expString = String.format("%.2f", expected);
        String actString = String.format("%.2f", actual);
        assertEquals(expString, actString);
    }
}