# Builder Scenario 1:

## Run data:

URL: 

## Execution

### USER:

Given the following classes: 
```java
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}

public enum CarType {
    CITY_CAR, SPORTS_CAR, SUV
}

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}

public enum Transmission {
    SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC
}

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}

```
How would you implement the capability of creating different models of cars with or without GPSNavigator, TripComputer, etc?

### ChatGPT

To implement the capability of creating different models of cars with customizable features such as a GPSNavigator, TripComputer, etc., you can use the Builder pattern. The Builder pattern allows for the step-by-step construction of complex objects and makes it possible to produce different types and representations of an object using the same construction code.

Here's how you could implement a `CarBuilder` class to facilitate the construction of `Car` objects with various configurations:

```java
public class CarBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
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

    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
```

Usage example:
```java
CarBuilder builder = new CarBuilder();

Car cityCar = builder.setCarType(CarType.CITY_CAR)
                      .setSeats(4)
                      .setEngine(new Engine(1.2, 0))
                      .setTransmission(Transmission.AUTOMATIC)
                      .setTripComputer(new TripComputer())
                      .setGPSNavigator(new GPSNavigator())
                      .build();

Car suv = builder.setCarType(CarType.SUV)
                 .setSeats(6)
                 .setEngine(new Engine(2.5, 0))
                 .setTransmission(Transmission.MANUAL)
                 .build(); // Without TripComputer and GPSNavigator
```

This approach offers the flexibility to optionally include features like a TripComputer and GPSNavigator. The `CarBuilder` class provides setter methods for each attribute of a `Car`, and each method returns the `CarBuilder` instance, allowing for method chaining. The `build()` method constructs the final `Car` instance, incorporating the specified configurations.

Using the Builder pattern simplifies the creation of `Car` objects with different combinations of features, improving code readability and maintainability.

### User
 
 Provide a complete usage example with pretty console output

### ChatGPT

To demonstrate a complete usage example of the Builder pattern for creating different models of cars with the provided classes, including pretty console output, let's expand on the usage example with a main application that creates several car configurations and then prints their details in a nicely formatted manner.

First, ensure the provided classes and the `CarBuilder` implementation are in your project. Then, create a main application that uses these classes to build different car models and prints their configurations.

```java
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
```

This example demonstrates creating a `cityCar` with a full set of features (engine, transmission, trip computer, and GPS navigator) and an `SUV` that lacks a trip computer and GPS navigator. The `printCarDetails` method takes a `Car` object as an argument and prints its details in a readable format, showing whether each feature is present and providing specific details like engine volume and mileage, car type, and the number of seats. 

The use of `System.out.println` with separators (like `------------------------------------------------`) helps in distinguishing between different car details for better readability in the console output. This approach allows you to easily visualize the configurations of different car models created using the Builder pattern.

## Evaluation and Discussion

In this case we have specified the need of creating different models of cars. The LLM identified the opportunity of applying the design pattern proactively and suggested an excerpt of implementation. When we requested a complete and functional implementation of application using the CarBuilder, it generated an implementation that was fully functional and correct.



