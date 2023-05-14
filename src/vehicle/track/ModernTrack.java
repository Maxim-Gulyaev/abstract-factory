package vehicle.track;

import vehicle.Vehicle;
import vehicle.interfaces.Track;

public class ModernTrack extends Vehicle implements Track {
    @Override
    public void go() {
        System.out.println("Modern track goes");
    }
}
