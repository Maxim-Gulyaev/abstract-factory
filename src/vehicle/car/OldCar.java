package vehicle.car;

import vehicle.Vehicle;
import vehicle.interfaces.Car;

public class OldCar extends Vehicle implements Car {
    @Override
    public void go() {
        System.out.println("Old car goes");
    }
}
