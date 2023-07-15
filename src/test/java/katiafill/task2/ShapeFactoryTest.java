package katiafill.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void createCircle() {
        ShapeFactory factory = new CircleShapeFactory();
        create(factory, List.of(5.0));
    }

    @Test
    void createRectangle() {
        ShapeFactory factory = new RectangleShapeFactory();
        create(factory, List.of(3.0, 4.0));
    }

    @Test
    void createTriangle() {
        ShapeFactory factory = new TriangleShapeFactory();
        create(factory, List.of(3.0, 4.0, 5.0));
    }

    private static void create(ShapeFactory factory, List<Double> params) {
        Shape shape = factory.createShape(params);
        ShapeDescriptionBuilder builder = factory.createBuilder(shape);
        builder.build();
    }
}