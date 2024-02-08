package run1;

import java.util.ArrayList;
import java.util.List;

public class ShapeExample {
    public static void main(String[] args) {
        try {
            // Create individual shapes
            Rectangle rectangle = new Rectangle(10, 20, 50, 40, "red");
            Circle circle = new Circle(15, 25, "blue", 30);
            Line line = new Line(0, 0, "green", 20, 20);

            // Add individual shapes to a complex shape
            List<Shape> shapes = new ArrayList<>();
            shapes.add(rectangle);
            shapes.add(circle);
            shapes.add(line);
            ComplexShape complexShape = new ComplexShape(5, 5, "mixed", shapes);

            // Clone the complex shape
            ComplexShape clonedComplexShape = complexShape.clone();

            // Move the original complex shape
            System.out.println("Before moving:");
            complexShape.draw();

            System.out.println("\nMoving original complex shape...");
            complexShape.move(10, 10);

            System.out.println("\nAfter moving:");
            complexShape.draw();

            // Show that the cloned complex shape has not moved
            System.out.println("\nCloned complex shape (unmoved):");
            clonedComplexShape.draw();

            // This demonstrates that the cloned complex shape is independent of the original
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
