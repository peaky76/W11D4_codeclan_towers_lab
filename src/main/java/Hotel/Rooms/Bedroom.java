package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
