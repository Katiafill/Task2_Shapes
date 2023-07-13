package katiafill.task2;

public abstract class ShapeDescriptionBuilder {

    private final StringBuilder builder;
    private final String lineSeparator = System.lineSeparator();
    private final String nameSeparator = ":";
    protected Shape shape;

    ShapeDescriptionBuilder(Shape shape) {
        builder = new StringBuilder(50);
        this.shape = shape;
    }

    // -------------- Public ---------------------------------------

    void build() {
        buildCommonDescription();
        buildSpecificDescription();
    }

    String description() {
        return builder.toString();
    }

    // -------------- Protected -------------------------------------

    protected abstract void buildSpecificDescription();

    private void buildCommonDescription() {
        appendProperty("Название", shape.name());
        appendProperty("Площадь", shape.square());
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
        builder.append(name)
                .append(nameSeparator)
                .append(" ")
                .append(String.format("%.2f", value));
        builder.append(lineSeparator);
    }

}
