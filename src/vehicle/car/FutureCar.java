package vehicle.car;

import vehicle.Vehicle;
import vehicle.interfaces.Car;

public class FutureCar extends Vehicle implements Car {
    @Override
    public void go() {
        System.out.println("Future car goes");
    }
}
