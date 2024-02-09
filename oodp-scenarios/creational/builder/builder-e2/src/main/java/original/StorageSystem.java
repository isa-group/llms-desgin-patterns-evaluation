package original;

public class StorageSystem {
    double capacity;
    MemoryUnit unit;
    double speed;
    StorageSystemType type;
    String brand;
    String model;
    
    public StorageSystem(double capacity, MemoryUnit unit, double speed, StorageSystemType type, String brand, String model) {
        this.capacity = capacity;
        this.unit = unit;
        this.speed = speed;
        this.type = type;
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

    public StorageSystemType getType() {
        return type;
    }

    public void setType(StorageSystemType type) {
        this.type = type;
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
        return "StorageSystem: " + brand + " " + model + " " + capacity + " " + unit + " " + speed + "GB/s " + type;
    }   

}
