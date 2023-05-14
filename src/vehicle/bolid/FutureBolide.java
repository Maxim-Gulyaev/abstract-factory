package vehicle.bolid;

import vehicle.Vehicle;
import vehicle.interfaces.Bolid;

public class FutureBolide extends Vehicle implements Bolid {
    @Override
    public void go() {
        System.out.println("Future bolid goes");
    }
}
