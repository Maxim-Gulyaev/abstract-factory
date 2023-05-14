package vehicle.car;

import vehicle.Vehicle;
import vehicle.interfaces.Car;

public class ModernCar extends Vehicle implements Car {
    @Override
    public void go() {
        System.out.println("Modern car goes");
    }
}
