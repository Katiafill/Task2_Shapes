package katiafill.task2;

import katiafill.task2.models.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void diameter() {
        Circle shape = new Circle(5);
        assertEquals(shape.diameter(), 10);
    }

    @Test
    void square() {
        Circle shape = new Circle(5);
        assertEquals(shape.square(), Math.PI * 25);
    }

    @Test
    void perimeter() {
        Circle shape = new Circle(5);
        assertEquals(shape.perimeter(), Math.PI * 10);
    }

}