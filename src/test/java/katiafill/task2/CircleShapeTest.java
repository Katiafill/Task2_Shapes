package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleShapeTest {

    @Test
    void diameter() {
        CircleShape shape = new CircleShape(5);
        assertEquals(shape.diameter(), 10);
    }

    @Test
    void square() {
        CircleShape shape = new CircleShape(5);
        assertEquals(shape.square(), Math.PI * 25);
    }

    @Test
    void perimeter() {
        CircleShape shape = new CircleShape(5);
        assertEquals(shape.perimeter(), Math.PI * 10);
    }

    @Test
    void description() {
        CircleShape shape = new CircleShape(5);
        String lineSeparator = System.lineSeparator();
        assertEquals(shape.description(),
                "Название: Круг" + lineSeparator +
                "Площадь: 78,54" + lineSeparator +
                "Периметр: 31,42" + lineSeparator +
                "Радиус: 5,00" + lineSeparator +
                "Диаметр: 10,00" + lineSeparator);
    }
}