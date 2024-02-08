package run1;

public class TreeExample {
    public static void main(String[] args) {
        double[] position = {100.0, 200.0};

        // Create a PineTree
        PineTree pineTree = new PineTree(50.0, 1.5, 5000, 10, position);
        
        // Clone the PineTree
        PineTree clonedPineTree = pineTree.clone();
        
        // Create a PlasticTree
        PlasticTree plasticTree = new PlasticTree(30.0, 1.2, 300, 5, position);
        
        // Clone the PlasticTree
        PlasticTree clonedPlasticTree = plasticTree.clone();
        
        // Example to show they are indeed different objects
        System.out.println("Original PineTree position: " + java.util.Arrays.toString(pineTree.position));
        System.out.println("Cloned PineTree position: " + java.util.Arrays.toString(clonedPineTree.position));
        
        // Change the position of the cloned pine tree
        clonedPineTree.position[0] = 150.0; 
        System.out.println("After changing cloned PineTree position: " + java.util.Arrays.toString(clonedPineTree.position));
        System.out.println("Original PineTree position (should be unchanged): " + java.util.Arrays.toString(pineTree.position));
    }
}

