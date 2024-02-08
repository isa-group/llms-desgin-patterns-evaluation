package run1;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    // Getter and setter methods for radius

    @Override
    public void draw() {
        System.out.println("Drawing Circle at:(" + getX() + "," + getY() + "), radius: " + radius + ", color: " + getColor());
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
