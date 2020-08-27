package Hotel;

import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;

import java.util.ArrayList;
import java.util.Collection;
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

    public void checkIn(Room room, ArrayList<Guest> guests) {
        if (room.isEmpty()) {
            for (Guest guest : guests) {
                room.addGuest(guest);
            }
        }
    }

    public void checkOut(Room room, ArrayList<Guest> guests) {
        for (Guest guest : guests) {
            room.removeGuest(guest);
        }
    }

    public Booking bookRoom(Bedroom bookedRoom, int nightsBooked) {
        Booking newBooking = new Booking(bookedRoom, nightsBooked);
        this.bookings.add(newBooking);
        return newBooking;
    }

    public ArrayList<Bedroom> getVacantRooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<Bedroom>();
        for (Bedroom bedroom: bedrooms) {
            if (bedroom.getGuests().size() == 0 ){
                vacantRooms.add(bedroom);
            }
        }
        return vacantRooms;
    }
}
