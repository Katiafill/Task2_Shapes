package katiafill.task2;

import katiafill.task2.builder.ShapeDescriptionBuilder;
import katiafill.task2.factory.CircleShapeFactory;
import katiafill.task2.factory.RectangleShapeFactory;
import katiafill.task2.factory.ShapeFactory;
import katiafill.task2.factory.TriangleShapeFactory;
import katiafill.task2.models.Rectangle;
import katiafill.task2.models.Shape;
import katiafill.task2.models.ShapeType;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {
    private final ShapeFactory circleFactory = new CircleShapeFactory();
    private final ShapeFactory rectangleFactory = new RectangleShapeFactory();
    private final ShapeFactory triangleFactory = new TriangleShapeFactory();

    @Test
    void shapeType() {
        checkType("CIRCLE", ShapeType.CIRCLE);
        checkType("RECTANGLE", ShapeType.RECTANGLE);
        checkType("Triangle", ShapeType.TRIANGLE);
        checkType("InvalidType", null);
    }

    private static void checkType(String sType, ShapeType actualType) {
        ShapeType type = ShapeType.fromString(sType);
        assertEquals(type, actualType);
    }

    @Test
    void createCircle() {
        try {
            createShape(circleFactory, List.of(5.0));
        } catch (IllegalArgumentException ex) {
            fail(ex);
        }
    }

    @Test
    void createCircleWithWrongRadius() {
        checkErrors(circleFactory, List.of(-5.0), "Parameter should be more 0.");
        checkErrors(circleFactory, List.of(0.0), "Parameter should be more 0.");
    }

    @Test
    void createCircleWithWrongParameters() {
        checkErrors(circleFactory, List.of(5.0, 6.0), "Wrong number of parameters 2, should be 1.");
        checkErrors(circleFactory, List.of(), "Wrong number of parameters 0, should be 1.");
    }


    @Test
    void createRectangle() {
        try {
            createShape(rectangleFactory, List.of(3.0, 4.0));
        } catch (IllegalArgumentException ex) {
            fail(ex);
        }
    }

    @Test
    void createRectangle2() {
        try {
            // Проверить, что правильно выставляется ширина и длина.
            Rectangle shape = (Rectangle)rectangleFactory.createShape(List.of(4.0, 3.0));
            assertEquals(shape.getWidth(), 3.0);
            assertEquals(shape.getLength(), 4.0);
        } catch (IllegalArgumentException ex) {
            fail(ex);
        }
    }

    @Test
    void createRectangleWithWrongParameters() {
        checkErrors(rectangleFactory, List.of(-5.0), "Wrong number of parameters 1, should be 2.");

        checkErrors(rectangleFactory, List.of(-5.0, 6.0), "Parameter should be more 0.");
        checkErrors(rectangleFactory, List.of(5.0, -6.0), "Parameter should be more 0.");
    }

    @Test
    void createTriangle() {
        try {
            createShape(triangleFactory, List.of(3.0, 4.0, 5.0));
        } catch (IllegalArgumentException ex) {
            fail(ex);
        }
    }

    @Test
    void createTriangleWithWrongParameters() {
        checkErrors(triangleFactory, List.of(5.0), "Wrong number of parameters 1, should be 3.");

        checkErrors(triangleFactory, List.of(-5.0, 6.0, 5.0), "Parameter should be more 0.");
        checkErrors(triangleFactory, List.of(5.0, -6.0, 5.0), "Parameter should be more 0.");
        checkErrors(triangleFactory, List.of(5.0, 6.0, -5.0), "Parameter should be more 0.");

        checkErrors(triangleFactory, List.of(5.0, 15.0, 5.0), "Incorrect triangle parameters, the triangle condition is not met.");
    }

    private void checkErrors(ShapeFactory factory, List<Double> params, String actual) {
        try {
            createShape(factory, params);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), actual);
        }
    }

    private void createShape(ShapeFactory factory, List<Double> params) {
        Shape shape = factory.createShape(params);
        ShapeDescriptionBuilder builder = factory.createBuilder(shape);
    }
}