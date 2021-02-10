package enums;

public enum Discount {
    CORPORATE(0.90),
    REGULAR(0.95),
    TEMPORARY(1.0);

    private final Double value;

    Discount(Double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}