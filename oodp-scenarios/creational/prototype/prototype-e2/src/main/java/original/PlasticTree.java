package original;

public class PlasticTree extends Tree{

    public PlasticTree(double length, double trunkRadius, long leaves, int age, double[] position) {
        super(length, trunkRadius, leaves, age, position);       
    }

    public double getWeight() {
        return length*5.0+0.001*leaves ;
      }
    
}
