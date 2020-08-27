package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        if (guests.size() < capacity) {
            guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (guests.contains(guest)) {
            guests.remove(guest);
        }
    }

    public boolean isEmpty() {
        return guests.size() == 0;
    }
}
