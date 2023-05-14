import factory.FutureFactory;
import factory.ModernFactory;
import factory.OldFactory;
import vehicle.interfaces.Bolid;
import vehicle.interfaces.Car;
import vehicle.interfaces.Track;

public class Main {
    public static void main(String[] args) {
        OldFactory oldFactory = new OldFactory();
        ModernFactory modernFactory = new ModernFactory();
        FutureFactory futureFactory = new FutureFactory();

        Car oldCar = oldFactory.createCar();
        Track track = modernFactory.createTrack();
        Bolid bolid = futureFactory.createBolid();

        oldCar.go();
        track.go();
        bolid.go();
    }
}