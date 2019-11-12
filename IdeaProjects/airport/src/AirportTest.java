import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {
    Airport airport = new Airport();
    Plane plane = new Plane();

    @org.junit.jupiter.api.Test
    void canLandPlane() {

        airport.land(plane);
        int i = airport.hangar.size();

        assertEquals(airport.hangar.get(i-1), plane);
    }

    @org.junit.jupiter.api.Test
    void canTakeOffPlane() {

        airport.land(plane);
        airport.takeoff(plane);

        assertEquals(airport.hangar.size(), 0);
    }
}