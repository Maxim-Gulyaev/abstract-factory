package factory;

import vehicle.bolid.OldBolid;
import vehicle.car.OldCar;
import vehicle.interfaces.Bolid;
import vehicle.interfaces.Car;
import vehicle.interfaces.Track;
import vehicle.track.OldTrack;

public class OldFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new OldCar();
    }

    @Override
    public Track createTrack() {
        return new OldTrack();
    }

    @Override
    public Bolid createBolid() {
        return new OldBolid();
    }
}
