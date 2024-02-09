package original;

public class RamMemoryCard {
    public double capacity;
    public MemoryUnit unit;
    public double speed;

    public RamMemoryCard(double capacity, MemoryUnit unit, double speed) {
        this.capacity = capacity;
        this.unit = unit;
        this.speed = speed;
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

    
}
