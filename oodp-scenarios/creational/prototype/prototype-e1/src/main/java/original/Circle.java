package original;

public class Circle extends Shape{

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;   
    }

    int radius;
    
    @Override
    public void draw() {
        // Somehow draw a circle:
    }

    @Override
    public void move(int x, int y) {
        setX(getX()+x);
        setY(getY()+y);
    }

    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
}
