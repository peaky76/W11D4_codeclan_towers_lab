import Hotel.Hotel;
import Hotel.Guest;
import Hotel.Booking;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel codeClanTowers;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    HashMap<String, DiningRoom> diningRooms;
    DiningRoom diningRoom1;
    DiningRoom diningRoom2;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before() {

        bedrooms = new ArrayList<Bedroom>();
        for (int i = 0; i < 80; i += 4) {
            bedrooms.add(new Bedroom(i + 1, RoomType.SINGLE, 80));
            bedrooms.add(new Bedroom( i + 2, RoomType.DOUBLE, 100));
            bedrooms.add(new Bedroom( i + 3, RoomType.TWIN, 100));
            bedrooms.add(new Bedroom( i + 4, RoomType.FAMILY, 140));
        }

        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(new ConferenceRoom("Pentland Room", 100));
        conferenceRooms.add(new ConferenceRoom("Forth Room", 150));
        conferenceRooms.add(new ConferenceRoom("Lothian Room", 250));

        diningRooms = new HashMap<String, DiningRoom>();
        diningRoom1 = new DiningRoom("Breakfast Lounge", 80);
        diningRoom2 = new DiningRoom("Luxury Lounge", 60);
        diningRooms.put(diningRoom1.getName(), diningRoom1);
        diningRooms.put(diningRoom2.getName(), diningRoom2);

        codeClanTowers = new Hotel(bedrooms, conferenceRooms, diningRooms);
        guest1 = new Guest("Fred Bloggs");
        guest2 = new Guest("Guesty McGuestface");

        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(80, codeClanTowers.getBedrooms().size());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(3, codeClanTowers.getConferenceRooms().size());
    }

    @Test
    public void canCheckInGuest() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(bookedRoom, guests);
        assertEquals(2, bookedRoom.getGuests().size() );
    }

    @Test
    public void canCheckOutGuest() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkOut(bookedRoom, guests);
        assertEquals(0, bookedRoom.getGuests().size() );
    }

    @Test
    public void canBookRoom() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        Booking booking = codeClanTowers.bookRoom(bookedRoom, 5);
        assertEquals(bookedRoom, booking.getBedroom());
        assertEquals(5, booking.getNightsBooked());
    }

    @Test
    public void canGetDiningRooms() {
        assertEquals(diningRoom1, diningRooms.get("Breakfast Lounge") );
        assertEquals(2, diningRooms.size());
    }

    @Test
    public void canGetVacantRooms() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(bookedRoom, guests);
        assertEquals(79, codeClanTowers.getVacantRooms().size());
    }

}
