package run2;


import original.CarType;
import original.Engine;
import original.GPSNavigator;
import original.Transmission;
import original.TripComputer;

public class CarBuilder {
    private CarType type;
    private double fuel;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarBuilder setType(CarType type) {
        this.type = type;
        return this;
    }

    public CarBuilder setFuel(double fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    public CarBuilder setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build() {
        // Assuming the Car class has a constructor that accepts all these parameters.
        return new Car(type, fuel, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
