package task2.t1;

public enum FuelType {
    DIESEL("Diesel"),
    GASOLINE("Gasoline");

    private final String displayName;
    FuelType(String name) {
        this.displayName = name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
