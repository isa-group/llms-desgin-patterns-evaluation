package run1;

public class SquarePeg {
    private final double width;

    public SquarePeg(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
