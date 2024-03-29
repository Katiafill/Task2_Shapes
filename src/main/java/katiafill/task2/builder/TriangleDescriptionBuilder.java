package katiafill.task2.builder;

import katiafill.task2.models.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleDescriptionBuilder extends ShapeDescriptionBuilder {
    public static final Logger logger = LoggerFactory.getLogger(TriangleDescriptionBuilder.class.getName());

    public TriangleDescriptionBuilder(Triangle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        logger.info("Добавление специфической информации о треугольнике.");
        appendProperty("Стороны", "");

        Triangle s = (Triangle)shape;
        appendSideAndAngle(s.sideA, s.angleBCA());
        appendSideAndAngle(s.sideB, s.angleCAB());
        appendSideAndAngle(s.sideC, s.angleABC());
    }

    private void appendSideAndAngle(double side, double angle) {
        builder.append(String.format("%.2f %s - %.2f%s", side, Units.SIMPLE.getValue(), angle, Units.DEGREES.getValue()));
        builder.append(lineSeparator);
    }
}
