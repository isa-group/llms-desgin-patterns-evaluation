package original;

public class Line extends Shape{

    int endx;
    int endy;

    public Line(int x, int y, String color, int endx, int endy   ) {        
        super(x, y, color);
        this.endx = endx;
        this.endy = endy;
    }

    @Override
    public void draw() {
        // Somehow draw a line:
    }

    @Override
    public void move(int x, int y) {
        setX(getX()+x);
        setY(getY()+y);
        endx += x;
        endy += y;  
    }

    public int getEndx() {
        return endx;
    }
    
    public void setEndx(int endx) {
        this.endx = endx;
    }

    public int getEndy() {
        return endy;
    }

    public void setEndy(int endy) {
        this.endy = endy;
    }
    
}
