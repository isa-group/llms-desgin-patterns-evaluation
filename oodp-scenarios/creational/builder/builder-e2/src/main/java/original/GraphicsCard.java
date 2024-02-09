package original;

public class GraphicsCard {
    public double capacity;
    public MemoryUnit unit;
    public double speed;
    public String brand;
    public String model;    

    public GraphicsCard(double capacity, double speed, String brand, String model) {
        this.capacity = capacity;
        this.unit = MemoryUnit.GB;
        this.speed = speed;
        this.brand = brand;
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public MemoryUnit getUnit() {
        return unit;
    }

    public void setUnit(MemoryUnit unit) {
        this.unit = unit;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
     
    public String toString() {
        return "Graphics Card: " + brand + " " + model + " " + capacity + unit + speed + "GHz";
    }
}
