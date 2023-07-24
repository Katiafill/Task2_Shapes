package katiafill.task2.builder;

import katiafill.task2.models.Rectangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RectangleDescriptionBuilder extends ShapeDescriptionBuilder {
    public static final Logger logger = LoggerFactory.getLogger(RectangleDescriptionBuilder.class.getName());

    public RectangleDescriptionBuilder(Rectangle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        logger.info("Добавление специфической информации о прямоугольнике.");
        Rectangle rect = (Rectangle)shape;
        appendProperty("Длина", rect.length);
        appendProperty("Ширина", rect.width);
        appendProperty("Диагональ", rect.diagonal());
    }
}
