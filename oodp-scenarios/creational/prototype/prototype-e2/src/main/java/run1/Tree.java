package run1;

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
        this.position = position.clone(); // Ensure position array is copied to prevent aliasing
    }
    
    // Getter and setter methods...

    public double getWeight() {
        return length * trunkRadius * age / 10 + leaves * 0.01;
    }

    @Override
    public Tree clone() {
        try {
            Tree clonedTree = (Tree) super.clone();
            clonedTree.position = this.position.clone(); // Deep copy of the position array
            return clonedTree;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should not happen
        }
    }
}

