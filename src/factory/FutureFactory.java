package factory;

import vehicle.bolid.FutureBolide;
import vehicle.car.FutureCar;
import vehicle.interfaces.Bolid;
import vehicle.interfaces.Car;
import vehicle.interfaces.Track;
import vehicle.track.FutureTrack;

public class FutureFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new FutureCar();
    }

    @Override
    public Track createTrack() {
        return new FutureTrack();
    }

    @Override
    public Bolid createBolid() {
        return new FutureBolide();
    }
}
