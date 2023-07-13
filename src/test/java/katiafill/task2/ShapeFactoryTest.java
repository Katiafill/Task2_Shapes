package katiafill.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void createCircle() {
        ShapeFactory factory = new CircleShapeFactory();
        Shape shape = factory.createShape("5");
        ShapeDescriptionBuilder builder = factory.createBuilder(shape);
    }
}