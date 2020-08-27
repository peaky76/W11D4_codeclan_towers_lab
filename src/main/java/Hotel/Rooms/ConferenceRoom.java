package Hotel.Rooms;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(String name, int capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
