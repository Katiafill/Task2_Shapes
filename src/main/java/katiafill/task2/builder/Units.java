package katiafill.task2.builder;

public enum Units {
    SIMPLE("см"),
    SQUARE("кв. см"),
    DEGREES("°");

    private final String value;
    Units(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
