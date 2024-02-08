package run2;

public class Line extends Shape {
    int endx;
    int endy;

    public Line(int x, int y, String color, int endx, int endy) {
        super(x, y, color);
        this.endx = endx;
        this.endy = endy;
    }

    // Getter and setter methods remain unchanged

    @Override
    public void draw() {
        // Draw the line somehow
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
        endx += x;
        endy += y;
    }

    @Override
    public Shape cloneShape() {
        return new Line(this.X, this.Y, this.color, this.endx, this.endy);
    }
}
