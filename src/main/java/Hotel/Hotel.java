package Hotel;

import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
        this.bookings = new ArrayList<Booking>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<Booking> getBookings() { return bookings; }

    public void checkIn(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOut(Room room, Guest guest) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bookedRoom, int nightsBooked) {
        Booking newBooking = new Booking(bookedRoom, nightsBooked);
        this.bookings.add(newBooking);
        return newBooking;
    }
}
