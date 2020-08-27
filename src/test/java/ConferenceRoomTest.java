import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Forth Room", 100);
    }

    @Test
    public void canGetName() { assertEquals("Forth Room", conferenceRoom.getName()); }

    @Test
    public void canGetCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

}
