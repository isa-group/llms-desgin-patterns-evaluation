package run1;

import original.Car;
import original.CarType;
import original.Engine;
import original.GPSNavigator;
import original.Transmission;
import original.TripComputer;

public class CarApplication {

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();

        // Building a city car with all features
        Car cityCar = builder.setCarType(CarType.CITY_CAR)
                             .setSeats(4)
                             .setEngine(new Engine(1.2, 10000))
                             .setTransmission(Transmission.AUTOMATIC)
                             .setTripComputer(new TripComputer())
                             .setGPSNavigator(new GPSNavigator())
                             .build();

        // Building an SUV without TripComputer and GPSNavigator
        Car suv = builder.setCarType(CarType.SUV)
                         .setSeats(6)
                         .setEngine(new Engine(2.5, 0))
                         .setTransmission(Transmission.MANUAL)
                         // Resetting optional features
                         .setTripComputer(null)
                         .setGPSNavigator(null)
                         .build();

        printCarDetails(cityCar);
        printCarDetails(suv);
    }

    private static void printCarDetails(Car car) {
        System.out.println("------------------------------------------------");
        System.out.println("Car Type: " + car.getCarType());
        System.out.println("Seats: " + car.getSeats());
        System.out.println("Engine: Volume - " + car.getEngine().getVolume() + ", Mileage - " + car.getEngine().getMileage());
        System.out.println("Transmission: " + car.getTransmission());
        if (car.getTripComputer() != null) {
            System.out.println("Trip Computer: Present");
        } else {
            System.out.println("Trip Computer: Not present");
        }
        if (car.getGpsNavigator() != null) {
            System.out.println("GPS Navigator: Present");
            System.out.println("Route: " + car.getGpsNavigator().getRoute());
        } else {
            System.out.println("GPS Navigator: Not present");
        }
        System.out.println("------------------------------------------------\n");
    }
}

