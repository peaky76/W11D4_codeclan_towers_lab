import Hotel.Guest;
import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Breakfast Room", 80);
        guest = new Guest("Fred Bloggs");
    }

    @Test
    public void canGetName() { assertEquals("Breakfast Room", diningRoom.getName()); }

    @Test
    public void canGetCapacity() {
        assertEquals(80, diningRoom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.getGuests().size());
    }

}
