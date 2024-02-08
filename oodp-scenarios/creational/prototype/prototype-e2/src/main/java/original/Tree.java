package original;

public class Tree {
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
        this.position = position;        
    }
    
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getTrunkRadius() {
        return trunkRadius;
    }
    public void setTrunkRadius(double trunkRadius) {
        this.trunkRadius = trunkRadius;
    }
    public long getLeaves() {
        return leaves;
    }
    public void setLeaves(long leaves) {
        this.leaves = leaves;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return length*trunkRadius*age/10+leaves*0.01;
    }

    
}
