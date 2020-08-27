import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Breakfast Room", 80);
    }

    @Test
    public void canGetName() { assertEquals("Breakfast Room", diningRoom.getName()); }

    @Test
    public void canGetCapacity() {
        assertEquals(80, diningRoom.getCapacity());
    }

}
