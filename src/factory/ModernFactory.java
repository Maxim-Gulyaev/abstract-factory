package factory;

import vehicle.bolid.ModernBolid;
import vehicle.car.ModernCar;
import vehicle.interfaces.Bolid;
import vehicle.interfaces.Car;
import vehicle.interfaces.Track;
import vehicle.track.ModernTrack;

public class ModernFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new ModernCar();
    }

    @Override
    public Track createTrack() {
        return new ModernTrack();
    }

    @Override
    public Bolid createBolid() {
        return new ModernBolid();
    }
}
