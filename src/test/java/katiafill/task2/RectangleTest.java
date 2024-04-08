package katiafill.task2;

import katiafill.task2.models.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void sides() {
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.getWidth(), 3);
        assertEquals(rect.getLength(), 4);
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