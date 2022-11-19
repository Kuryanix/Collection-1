package Transport;

public enum Capacity {
    CPT_VERY_SMALL(0,10),
    CPT_SMALL(10,25),
    CPT_MID(40,60),
    CPT_BIG(60,80),
    CPT_VERY_BIG(100,120);

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
