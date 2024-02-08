package run1;

public class Line extends Shape {
    int endX;
    int endY;

    public Line(int x, int y, String color, int endX, int endY) {
        super(x, y, color);
        this.endX = endX;
        this.endY = endY;
    }

    // Getter and setter methods for endX and endY

    @Override
    public void draw() {
        System.out.println("Drawing Line from:(" + getX() + "," + getY() + ") to (" + endX + "," + endY + "), color: " + getColor());
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
        endX += x;
        endY += y;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
