package Hotel.Rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    TWIN(2),
    TRIPLE(3),
    FAMILY(4);

    private int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
