package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DescriptionBuilderTest {
    private final String lineSeparator = System.lineSeparator();

    @Test
    void circleDescription() {
        Circle shape = new Circle(5);
        CircleDescriptionBuilder builder = new CircleDescriptionBuilder(shape);

        assertEquals(builder.description(),
                "Название: Круг" + lineSeparator +
                "Площадь: 78,54 кв. см" + lineSeparator +
                "Периметр: 31,42 см" + lineSeparator +
                "Радиус: 5,00 см" + lineSeparator +
                "Диаметр: 10,00 см" + lineSeparator);
    }

    @Test
    void rectangleDescription() {
        Rectangle rect = new Rectangle(3, 4);
        RectangleDescriptionBuilder builder = new RectangleDescriptionBuilder(rect);

        assertEquals(builder.description(),
                "Название: Прямоугольник" + lineSeparator +
                        "Площадь: 12,00 кв. см" + lineSeparator +
                        "Периметр: 14,00 см" + lineSeparator +
                        "Длина: 4,00 см" + lineSeparator +
                        "Ширина: 3,00 см" + lineSeparator +
                        "Диагональ: 5,00 см" + lineSeparator);
    }

    @Test
    void triangleDescription() {
        Triangle shape = new Triangle(3, 4, 5);
        TriangleDescriptionBuilder builder = new TriangleDescriptionBuilder(shape);

        assertEquals(builder.description(),
                "Название: Треугольник" + lineSeparator +
                        "Площадь: 6,00 кв. см" + lineSeparator +
                        "Периметр: 12,00 см" + lineSeparator +
                        "Стороны: " + lineSeparator +
                        "3,00 см - 36,87°" + lineSeparator +
                        "4,00 см - 53,13°" + lineSeparator +
                        "5,00 см - 90,00°" + lineSeparator);
    }
}
