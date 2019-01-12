public enum PlaneType {
    A220(4),
    A330(6),
    A350(8),
    A380(10);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
