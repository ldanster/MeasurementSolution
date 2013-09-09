public final class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) throws IllegalArgumentException {
        if (value < 0) throw new IllegalArgumentException();
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Measurement) {
            Measurement other = (Measurement) obj;
            return this.representAsInch() == other.representAsInch();
        }
        return false;
    }

    private double representAsInch() {
        return this.unit.representAsInch(this.value);
    }
}
