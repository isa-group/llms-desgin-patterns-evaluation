package run2;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape extends Shape {
    List<Shape> components = new ArrayList<>();

    public ComplexShape(int x, int y, String color, List<Shape> components) {
        super(x, y, color);
        this.components = new ArrayList<>(components); // Make a shallow copy for initialization
    }

    @Override
    public void draw() {
        for (Shape shape : components) {
            shape.draw();
        }
    }

    @Override
    public void move(int x, int y) {
        for (Shape shape : components) {
            shape.move(x, y);
        }
    }

    @Override
    public Shape cloneShape() {
        List<Shape> clonedComponents = new ArrayList<>();
        for (Shape shape : components) {
            clonedComponents.add(shape.cloneShape());
        }
        return new ComplexShape(this.X, this.Y, this.color, clonedComponents);
    }
}
