package run2;


import original.CarType;
import original.Engine;
import original.GPSNavigator;
import original.Transmission;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new CarBuilder()
                .setType(CarType.SPORTS_CAR)
                .setFuel(50)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setGpsNavigator(new GPSNavigator("Fastest route to Monte Carlo"))
                .build();

        printCarDetails(sportsCar);
    }

    private static void printCarDetails(Car car) {
        System.out.println("Car Details:");
        System.out.println("Type: " + car.getType());
        System.out.println("Fuel: " + car.getFuel() + " liters");
        System.out.println("Seats: " + car.getSeats());
        System.out.println("Engine: " + car.getEngine().getVolume() + "L, " + car.getEngine().getMileage() + "km mileage, Started: " + (car.getEngine().isStarted() ? "Yes" : "No"));
        System.out.println("Transmission: " + car.getTransmission());
        if (car.getTripComputer() != null) {
            System.out.println("Trip Computer: Present");
        } else {
            System.out.println("Trip Computer: Not present");
        }
        if (car.getGpsNavigator() != null) {
            System.out.println("GPS Navigator: " + car.getGpsNavigator().getRoute());
        } else {
            System.out.println("GPS Navigator: Not present");
        }
    }
}


