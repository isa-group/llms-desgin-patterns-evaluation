package run2;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // Getter and setter methods remain unchanged

    @Override
    public void draw() {
        // Draw the circle somehow
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this.X, this.Y, this.color, this.radius);
    }
}
