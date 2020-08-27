import Hotel.Guest;
import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Forth Room", 100);
        guest = new Guest("Fred Bloggs");
    }

    @Test
    public void canGetName() { assertEquals("Forth Room", conferenceRoom.getName()); }

    @Test
    public void canGetCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
    }
}
