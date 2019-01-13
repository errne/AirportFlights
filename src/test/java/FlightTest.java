import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {
    private Plane plane1;
    private  Flight flight1;
    private Passenger passenger;

    @Before
    public void before() {
        plane1 = new Plane("Ryanair", PlaneType.A220);
        flight1 = new Flight(plane1, "K00001", Destination.BOSTON);
        passenger = new Passenger("Bo");

    }

    @Test
    public void getPlane() {
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void getFlightNumber() {
        assertEquals("K00001", flight1.getFlightNumber());
    }

    @Test
    public void getDestination() {
        assertEquals(Destination.BOSTON, flight1.getDestination());
    }

    @Test
    public void getAirportCode() {
        assertEquals("BOS", flight1.getAirportCode());
    }

    @Test
    public void canAddPassenger(){
        flight1.addPassenger(passenger);
        assertEquals(1, flight1.getBookingCount());
    }

    @Test
    public void cannootAddPassengerifFull(){
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        flight1.addPassenger(passenger);
        assertEquals(4, flight1.getBookingCount());
    }
}