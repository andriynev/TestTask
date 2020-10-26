package task1;

public enum AnimalType {
    DOG("Dog"),
    CAT("Cat");

    private final String type;

    AnimalType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

    public static AnimalType getTypeByStr(String type) {
        for (AnimalType t : values()) {
            if (t.toString().equalsIgnoreCase(type)) {
                return t;
            }
        }
        throw new IllegalArgumentException("No enum found with type: [" + type + "]");
    }
}
