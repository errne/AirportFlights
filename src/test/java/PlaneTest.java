import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {
    private Plane smallPlane;

    @Before
    public void before() {
        smallPlane = new Plane("Ryanair", PlaneType.A220);
    }

    @Test
    public void cangetAirline() {
        assertEquals("Ryanair", smallPlane.getAirline());
    }

    @Test
    public void cangetType() {
        assertEquals(PlaneType.A220, smallPlane.getType());
    }

    @Test
    public void hasPassengersList(){
        assertEquals(0, smallPlane.getPassengerCount());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, smallPlane.getCapacity());
    }
}