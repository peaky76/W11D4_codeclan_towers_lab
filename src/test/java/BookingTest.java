import Hotel.Booking;
import Hotel.Rooms.Bedroom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(101, RoomType.DOUBLE, 100.00);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNightsBooked() {
        assertEquals(5, booking.getNightsBooked());
    }

    @Test
    public void canGetTotalBill() {
        assertEquals(500.00, booking.getTotalBill(), 0.01);
    }

}
