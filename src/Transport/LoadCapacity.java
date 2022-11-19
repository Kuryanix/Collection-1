package Transport;

public enum LoadCapacity {
    LC_N1(0D,3.5),
    LC_N2(3.5,12D),
    LC_N3(12D,null);

    private final Double from;
    private final Double to;

    LoadCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}
