package vehicle.track;

import vehicle.Vehicle;
import vehicle.interfaces.Track;

public class FutureTrack extends Vehicle implements Track  {
    @Override
    public void go() {
        System.out.println("Future track goes");
    }
}
