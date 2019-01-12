import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HangarTest {
    private Plane plane1;
    private Plane plane2;
    private Hangar hangar;

    @Before
    public void setUp() {
        plane1 = new Plane("Lufthansa", PlaneType.A330);
        plane2 = new Plane("Lufthansa", PlaneType.A350);
        hangar = new Hangar("Lufthansa Hangar", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Lufthansa Hangar", hangar.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, hangar.getCapacity());
    }

    @Test
    public void getPlaneCount() {
        assertEquals(0, hangar.getPlaneCount());
    }

    @Test
    public void canAddPlane() {
        hangar.addPlane(plane1);
        assertEquals(1, hangar.getPlaneCount());
    }

    @Test
    public void canCheckIfFull(){
        assertEquals(false, hangar.isFull());
    }

    @Test
    public void cannotaddPlaneIfFull() {
        hangar.addPlane(plane1);
        hangar.addPlane(plane2);
        hangar.addPlane(plane1);
        assertEquals(2, hangar.getPlaneCount());
    }

    @Test
    public void canRemovePlane(){
        hangar.addPlane(plane1);
        hangar.addPlane(plane2);
        hangar.removePlane(plane1);
        assertEquals(1, hangar.getPlaneCount());
    }
}