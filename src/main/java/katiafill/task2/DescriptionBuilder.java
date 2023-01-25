package katiafill.task2;

public class DescriptionBuilder {

    private StringBuilder builder;
    private String lineSeparator = System.lineSeparator();

    DescriptionBuilder() {
        builder = new StringBuilder(50);
    }

    DescriptionBuilder(String desc) {
        builder = new StringBuilder(desc.length() + 50);
        builder.append(desc);
    }

    void appendProperty(String name, String value) {
        builder.append(name + ": " + value);
        builder.append(lineSeparator);
    }

    void appendProperty(String name, double value) {
        builder.append(name + ": " + value);
        builder.append(lineSeparator);
    }

    String description() {
        return builder.toString();
    }
}
