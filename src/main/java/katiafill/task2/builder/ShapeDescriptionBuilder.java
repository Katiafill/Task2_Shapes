package katiafill.task2.builder;

import katiafill.task2.models.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ShapeDescriptionBuilder {
    public static final Logger logger = LoggerFactory.getLogger(ShapeDescriptionBuilder.class.getName());

    protected final StringBuilder builder;
    protected final String lineSeparator = System.lineSeparator();
    protected final String nameSeparator = ":";
    protected final Shape shape;

    // -------------- Public ---------------------------------------

    public String description() {
        return builder.toString();
    }

    // -------------- Protected -------------------------------------

    ShapeDescriptionBuilder(Shape shape) {
        builder = new StringBuilder(50);
        this.shape = shape;
        build();
    }

    private void build() {
        logger.info("Начало формирования описания фигуры.");
        buildCommonDescription();
        buildSpecificDescription();
        logger.info("Формирование описания завершено.");
    }

    protected abstract void buildSpecificDescription();

    private void buildCommonDescription() {
        logger.info("Добавление общей информации.");
        appendProperty("Название", shape.name());
        appendProperty("Площадь", shape.square(), Units.SQUARE);
        appendProperty("Периметр", shape.perimeter());
    }

    protected void appendProperty(String name, String value) {
        builder.append(name)
                .append(nameSeparator)
                .append(" ")
                .append(value);
        builder.append(lineSeparator);
    }

    protected void appendProperty(String name, double value) {
        appendProperty(name, value, Units.SIMPLE);
    }

    protected void appendProperty(String name, double value, Units unit) {
        appendProperty(name, String.format("%.2f %s", value, unit.getValue()));
    }

}
