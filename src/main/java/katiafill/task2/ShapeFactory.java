package katiafill.task2;

interface ShapeFactory {
    Shape createShape(String args);
    ShapeDescriptionBuilder createBuilder(Shape shape);
}

