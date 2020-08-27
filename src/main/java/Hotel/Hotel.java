package Hotel;

import Hotel.Rooms.Room;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkIn(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOut(Room room, Guest guest) {
        room.removeGuest(guest);
    }
}
