package run1;

import original.Circle;
import original.Drawing;
import original.Rectangle;
import original.Rhombus;
import original.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();

        // Adding rectangle and circle directly since they implement Shape
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        // Adding triangle and rhombus using the adapter
        Triangle triangle = new Triangle(1.0, 1.0, 1.0);
        Rhombus rhombus = new Rhombus(1.0, 1.0);
        drawing.addShape(new GeometricShapeAdapter(triangle));
        drawing.addShape(new GeometricShapeAdapter(rhombus));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
