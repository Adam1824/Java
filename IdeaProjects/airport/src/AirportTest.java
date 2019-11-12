import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @org.junit.jupiter.api.Test
    void canLandPlane() {
        Airport airport = new Airport();
        Plane plane = new Plane();

        airport.land(plane);
        int i = airport.hangar.size();

        assertSame(airport.hangar.get(i-1), plane);
    }

    @org.junit.jupiter.api.Test
    void canTakeOffPlane() {
        Airport airport = new Airport();
        Plane plane = new Plane();

        airport.land(plane);
        airport.takeoff(plane);

        assertEquals(airport.hangar.size(), 0);
    }
}