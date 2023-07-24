package katiafill.task2;

public enum OutputType {
    CONSOLE("-c"),
    FILE("-f");

    private final String value;
    OutputType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static OutputType getType(String raw) {
        for (OutputType type : OutputType.values()) {
            if (type.getValue().equalsIgnoreCase(raw)) {
                return type;
            }
        }

        return null;
    }
}
