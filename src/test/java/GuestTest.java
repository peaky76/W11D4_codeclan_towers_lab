import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Fred Bloggs");
    }

    @Test
    public void hasName() {
        assertEquals("Fred Bloggs", guest.getName());
    }

}
