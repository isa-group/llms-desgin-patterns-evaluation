package run2;

public class Main {
    public static void main(String[] args) {
        // Create a PineTree instance
        double[] position = {1.0, 2.0}; // Example position
        PineTree originalPineTree = new PineTree(100.0, 2.0, 5000, 10, position);
        
        // Clone the PineTree
        PineTree clonedPineTree = originalPineTree.clone();
        
        // Modify the clone's position to demonstrate it has its own position array
        clonedPineTree.position[0] = 3.0;
        clonedPineTree.position[1] = 4.0;
        
        // Show that the original position is unchanged
        System.out.println("Original PineTree position: " + originalPineTree.position[0] + ", " + originalPineTree.position[1]);
        System.out.println("Cloned PineTree position: " + clonedPineTree.position[0] + ", " + clonedPineTree.position[1]);
    }
}
