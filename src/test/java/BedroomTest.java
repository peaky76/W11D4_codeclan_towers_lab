import Hotel.Guest;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        bedroom = new Bedroom(101, RoomType.DOUBLE, 100.00);
        guest1 = new Guest("Fred Bloggs");
        guest2 = new Guest("Jane Doe");
        guest3 = new Guest("John Doe");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetNightlyRate() { assertEquals(100.00, bedroom.getNightlyRate(), 0.01); }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test
    public void cannotExceedCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.getGuests().size());
    }

}
