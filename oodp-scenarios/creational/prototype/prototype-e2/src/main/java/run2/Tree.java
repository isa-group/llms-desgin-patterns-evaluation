package run2;

public class Tree implements Cloneable {
    double length;
    double trunkRadius;
    long leaves;
    int age;
    double[] position;
    
    public Tree(double length, double trunkRadius, long leaves, int age, double[] position) {
        this.length = length;
        this.trunkRadius = trunkRadius;
        this.leaves = leaves;
        this.age = age;
        this.position = position.clone(); // Clone the array to ensure deep copy        
    }
    
    // Getters and setters for all properties...
    
    public double getWeight() {
        return length * trunkRadius * age / 10 + leaves * 0.01;
    }
    
    @Override
    public Tree clone() {
        try {
            Tree cloned = (Tree) super.clone();
            cloned.position = this.position.clone(); // Ensure a deep copy of the array
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This shouldn't happen since we're Cloneable
        }
    }
}
