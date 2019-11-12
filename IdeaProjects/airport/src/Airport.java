import java.util.ArrayList;

public class Airport {
    ArrayList<Plane> hangar = new ArrayList<Plane>();

    public void land(Plane plane) {
        hangar.add(plane);
    }

    public void takeoff(Plane plane) {
        hangar.remove(plane);
    }
}
