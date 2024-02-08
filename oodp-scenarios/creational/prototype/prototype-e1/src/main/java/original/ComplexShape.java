package original;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape extends Shape{

    List<Shape> components = new ArrayList<Shape>();

    public ComplexShape(int x, int y, String color, List<Shape> components) {
        super(x, y, color);
        this.components = components;
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
    
}
