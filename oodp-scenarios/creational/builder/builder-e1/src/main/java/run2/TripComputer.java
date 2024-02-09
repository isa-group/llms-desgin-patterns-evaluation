package run2;

import original.Car;

public class TripComputer extends original.TripComputer{
    
    private Car car;

    public TripComputer() {
        // No car set initially.
    }

    public void connectCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel() + " liters");
    }

    public void showStatus() {
        if (this.car != null && this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
