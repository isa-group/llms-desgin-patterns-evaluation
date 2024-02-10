package run1;

public class RoundPeg implements Peg {
    private final double radius;

    public RoundPeg(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getMinRadius() {
        return getRadius();
    }
}
