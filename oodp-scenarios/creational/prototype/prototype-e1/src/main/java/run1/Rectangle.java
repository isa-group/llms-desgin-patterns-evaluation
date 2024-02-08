package run1;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    // Getter and setter methods for width and height

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle at:(" + getX() + "," + getY() + "), width: " + width + ", height: " + height + ", color: " + getColor());
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
