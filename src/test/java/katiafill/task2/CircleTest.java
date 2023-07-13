package katiafill.task2;

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

//    @Test
//    void description() {
//        Circle shape = new Circle(5);
//        String lineSeparator = System.lineSeparator();
//        assertEquals(shape.description(),
//                "Название: Круг" + lineSeparator +
//                "Площадь: 78,54" + lineSeparator +
//                "Периметр: 31,42" + lineSeparator +
//                "Радиус: 5,00" + lineSeparator +
//                "Диаметр: 10,00" + lineSeparator);
//    }
}