package run2;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        // Create individual shapes
        Rectangle rectangle = new Rectangle(10, 10, 20, 15, "red");
        Line line = new Line(0, 0, "blue", 30, 30);
        Circle circle = new Circle(5, 5, "green", 10);

        // Add shapes to a list
        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(line);
        shapes.add(circle);

        // Create a complex shape
        ComplexShape complexShape = new ComplexShape(0, 0, "black", shapes);

        // Clone the complex shape
        ComplexShape clonedComplexShape = (ComplexShape) complexShape.cloneShape();

        // Modify the original complex shape
        complexShape.move(5, 5); // Move the original complex shape
        rectangle.setWidth(25); // Modify one of the shapes in the original complex shape

        // Output to demonstrate the difference after modification
        System.out.println("Original ComplexShape position: X=" + complexShape.getX() + ", Y=" + complexShape.getY());
        System.out.println("Cloned ComplexShape position: X=" + clonedComplexShape.getX() + ", Y=" + clonedComplexShape.getY());

        // Show that the rectangle inside the original complex shape has been modified, but not in the clone
        Rectangle originalRectangle = (Rectangle) complexShape.components.get(0);
        Rectangle clonedRectangle = (Rectangle) clonedComplexShape.components.get(0);

        System.out.println("Original Rectangle width: " + originalRectangle.getWidth());
        System.out.println("Cloned Rectangle width: " + clonedRectangle.getWidth());
    }
}
