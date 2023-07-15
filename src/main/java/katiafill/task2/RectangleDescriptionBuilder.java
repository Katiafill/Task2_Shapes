package katiafill.task2;

public class RectangleDescriptionBuilder extends ShapeDescriptionBuilder {

    RectangleDescriptionBuilder(Rectangle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        Rectangle rect = (Rectangle)shape;
        appendProperty("Длина", rect.length);
        appendProperty("Ширина", rect.width);
        appendProperty("Диагональ", rect.diagonal());
    }
}
