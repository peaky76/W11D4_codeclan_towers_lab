import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(101, RoomType.DOUBLE);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
 

}
