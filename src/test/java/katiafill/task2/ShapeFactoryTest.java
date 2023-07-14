package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void createCircle() {
        ShapeFactory factory = new CircleShapeFactory();
        create(factory, "5");
    }

    @Test
    void createRectangle() {
        ShapeFactory factory = new RectangleShapeFactory();
        create(factory, "3 4");
    }

    @Test
    void createTriangle() {
        ShapeFactory factory = new TriangleShapeFactory();
        create(factory, "3 4 5");
    }

    private static void create(ShapeFactory factory, String args) {
        Shape shape = factory.createShape(args);
        ShapeDescriptionBuilder builder = factory.createBuilder(shape);
        builder.build();
    }
}