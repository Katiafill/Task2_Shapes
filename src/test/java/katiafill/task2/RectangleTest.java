package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void sides() {
        // Проверка, что ширина всегда меньшая сторона, а длина - большая.
        Rectangle rect = new Rectangle(3, 4);
        assertEquals(rect.width, 3);
        assertEquals(rect.height, 4);

        rect = new Rectangle(4, 3);
        assertEquals(rect.width, 3);
        assertEquals(rect.height, 4);

        rect = new Rectangle(3,3);
        assertEquals(rect.width, 3);
        assertEquals(rect.height, 3);
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

    @Test
    void description() {
        Rectangle rect = new Rectangle(3, 4);
        String lineSeparator = System.lineSeparator();
        assertEquals(rect.description(),
                "Название: Прямоугольник" + lineSeparator +
                        "Площадь: 12,00" + lineSeparator +
                        "Периметр: 14,00" + lineSeparator +
                        "Длина: 4,00" + lineSeparator +
                        "Ширина: 3,00" + lineSeparator +
                        "Диагональ: 5,00" + lineSeparator);
    }
}