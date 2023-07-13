package katiafill.task2;

public enum Units {
    SIMPLE("см"),
    SQUARE("кв. см"),
    DEGREES("°");

    private final String name;
    Units(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
