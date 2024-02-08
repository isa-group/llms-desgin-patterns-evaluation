package original;

public class PineTree extends Tree {

    public PineTree(double length, double trunkRadius, long leaves, int age, double[] position) {
        super(length, trunkRadius, leaves, age, position);
        
    }

    public double getWeight() {
        return length*trunkRadius*age/5+leaves*0.001;
    }
    
}
