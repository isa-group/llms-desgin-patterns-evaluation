package run2;

public abstract class Shape implements CloneableShape {
    int X;
    int Y;
    String color;

    public Shape(int x, int y, String color) {
        X = x;
        Y = y;
        this.color = color;
    }

    // Getter and setter methods remain unchanged
    // Methds generated by the human in this case:
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
    public abstract void draw();
    public abstract void move(int x, int y);

    // The cloneShape method is abstract, forcing subclasses to provide an implementation
    public abstract Shape cloneShape();
}
