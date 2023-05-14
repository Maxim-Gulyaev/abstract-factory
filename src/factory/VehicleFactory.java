package factory;

import vehicle.interfaces.Bolid;
import vehicle.interfaces.Car;
import vehicle.interfaces.Track;

public interface VehicleFactory {

    public Car createCar();
    public Track createTrack();
    public Bolid createBolid();

}
