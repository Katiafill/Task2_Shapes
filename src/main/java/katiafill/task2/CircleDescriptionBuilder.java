package katiafill.task2;

public class CircleDescriptionBuilder extends ShapeDescriptionBuilder {

    CircleDescriptionBuilder(Circle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        appendProperty("Радиус", ((Circle)shape).radius);
        appendProperty("Диаметр", ((Circle)shape).diameter());
    }
}
