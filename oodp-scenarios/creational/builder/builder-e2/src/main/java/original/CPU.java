package original;

public class CPU {
    String brand;
    String model;
    double speed;
    int cores;
    int threads;

    public CPU(String brand, String model, double speed, int cores, int threads) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.cores = cores;
        this.threads = threads;
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String toString() {
        return "CPU: " + brand + " " + model + " " + speed + "GHz " + cores + "Cores " + threads + "Threads";
    }

}
