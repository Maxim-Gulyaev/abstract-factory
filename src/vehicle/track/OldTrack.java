package vehicle.track;

import vehicle.Vehicle;
import vehicle.interfaces.Track;

public class OldTrack extends Vehicle implements Track {
    @Override
    public void go() {
        System.out.println("Old track goes");
    }
}
