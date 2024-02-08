package original;

public abstract class Shape {
    int X;
    int Y;
    String color;

    public Shape(int x, int y, String color) {
        X = x;
        Y = y;
        this.color = color;
    }    

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

}
