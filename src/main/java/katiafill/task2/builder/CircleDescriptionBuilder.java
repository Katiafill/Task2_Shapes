package katiafill.task2.builder;

import katiafill.task2.models.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CircleDescriptionBuilder extends ShapeDescriptionBuilder {
    public static final Logger logger = LoggerFactory.getLogger(CircleDescriptionBuilder.class.getName());

    public CircleDescriptionBuilder(Circle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        logger.info("Добавление специфической информации о прямоугольнике.");
        Circle circle = (Circle)shape;
        appendProperty("Радиус", circle.radius);
        appendProperty("Диаметр", circle.diameter());
    }
}
