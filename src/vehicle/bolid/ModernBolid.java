package vehicle.bolid;

import vehicle.Vehicle;
import vehicle.interfaces.Bolid;

public class ModernBolid extends Vehicle implements Bolid {
    @Override
    public void go() {
        System.out.println("Modern bolid goes");
    }
}
