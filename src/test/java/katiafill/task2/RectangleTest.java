package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void sides() {
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.width, 3);
        assertEquals(rect.length, 4);

        rect = new Rectangle(4, 3);
        assertEquals(rect.width, 3);
        assertEquals(rect.length, 4);

        rect = new Rectangle(3,3);
        assertEquals(rect.width, 3);
        assertEquals(rect.length, 3);
    }

    @Test
    void square() {
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.square(), 12);
    }

    @Test
    void perimeter() {
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.perimeter(), 14);
    }

    @Test
    void diagonal() {
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.diagonal(), 5);
    }

}