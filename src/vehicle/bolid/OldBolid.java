package vehicle.bolid;

import vehicle.Vehicle;
import vehicle.interfaces.Bolid;

public class OldBolid extends Vehicle implements Bolid {
    @Override
    public void go() {
        System.out.println("Old bolid goes");
    }
}
