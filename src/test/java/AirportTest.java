import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {
    private Plane plane1;
    private Plane plane2;
    private Hangar hangar1;
    private Airport airport;
    private Passenger sue;

    @Before
    public void before(){
        plane1 = new Plane("Lufthansa", PlaneType.A330);
        plane2 = new Plane("Lufthansa", PlaneType.A350);
        hangar1 = new Hangar("Lufthansa Hangar", 2);
        hangar1.addPlane(plane1);
        hangar1.addPlane(plane2);
        airport = new Airport("KUN");
        airport.addHangar(hangar1);
        sue = new Passenger("Sue");

    }

    @Test
    public void hasAirportCode() {
        assertEquals("KUN", airport.getAirportCode());
    }

    @Test
    public void canCountHangars(){
        assertEquals(1, airport.getHangarCount());
    }

    @Test
    public void canAddHangar(){
        airport.addHangar(hangar1);
        assertEquals(2, airport.getHangarCount());
    }

    @Test
    public void canCreateFlight(){
        Flight newFlight = airport.createFlight(hangar1, Destination.EDINBURG, 8);
        assertEquals("LUF2886", newFlight.getFlightNumber());
        assertEquals(1, hangar1.getPlaneCount());
    }

    @Test
    public void cannSellTicket(){
        Flight newFlight2 = airport.createFlight(hangar1, Destination.GLASGOW, 6);
        airport.sellTicket(newFlight2, sue);
        assertEquals(1, newFlight2.getBookingCount());
    }

    @Test
    public void cannotSellTicket(){
        Flight newFlight2 = airport.createFlight(hangar1, Destination.GLASGOW, 6);
        for (int i = 0; i < 9; i++){
            airport.sellTicket(newFlight2, sue);
        }
        assertEquals(6, newFlight2.getBookingCount());
    }
}