package katiafill.task2;

public class RectangleDescriptionBuilder extends ShapeDescriptionBuilder {

    RectangleDescriptionBuilder(Rectangle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        appendProperty("Длина", ((Rectangle)shape).height);
        appendProperty("Ширина", ((Rectangle)shape).width);
        appendProperty("Диагональ", ((Rectangle)shape).diagonal());
    }
}
