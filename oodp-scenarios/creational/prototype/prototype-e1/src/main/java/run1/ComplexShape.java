package run1;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape extends Shape {
    List<Shape> components;

    public ComplexShape(int x, int y, String color, List<Shape> components) {
        super(x, y, color);
        this.components = components;
    }

    // Method to add a component
    public void addComponent(Shape shape) {
        components.add(shape);
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
    public ComplexShape clone() throws CloneNotSupportedException {
        ComplexShape cloned = (ComplexShape) super.clone();
        cloned.components = new ArrayList<>();
        for (Shape shape : this.components) {
            cloned.components.add(shape.clone());
        }
        return cloned;
    }
}
