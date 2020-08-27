import Hotel.Hotel;
import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel codeClanTowers;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        bedrooms = new ArrayList<Bedroom>();
        for (int i = 0; i < 20; ++i) {
            bedrooms.add(new Bedroom(i + 1, RoomType.DOUBLE));
        }
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(new ConferenceRoom("Pentland Room", 100));
        conferenceRooms.add(new ConferenceRoom("Forth Room", 150));
        codeClanTowers = new Hotel(bedrooms, conferenceRooms);
        guest1 = new Guest("Fred Bloggs");
        guest2 = new Guest("Guesty McGuestface");
    }

    @Test
    public void hasBedrooms() {
        assertEquals(20, codeClanTowers.getBedrooms().size());
    }

    @Test
    public void hasConferenceRooms() {
        assertEquals(2, codeClanTowers.getConferenceRooms().size());
    }

    @Test
    public void canCheckInGuest() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(bookedRoom, guest1);
        assertEquals(1, bookedRoom.getGuests().size() );
    }

    @Test
    public void canCheckOutGuest() {
        Bedroom bookedRoom = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkOut(bookedRoom, guest1);
        assertEquals(0, bookedRoom.getGuests().size() );
    }

}
