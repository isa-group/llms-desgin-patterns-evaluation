package run2;

public class PineTree extends Tree {
    public PineTree(double length, double trunkRadius, long leaves, int age, double[] position) {
        super(length, trunkRadius, leaves, age, position);
    }

    @Override
    public double getWeight() {
        return length * trunkRadius * age / 5 + leaves * 0.001;
    }
    
    @Override
    public PineTree clone() {
        return (PineTree) super.clone();
    }
}