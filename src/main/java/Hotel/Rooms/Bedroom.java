package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
}
