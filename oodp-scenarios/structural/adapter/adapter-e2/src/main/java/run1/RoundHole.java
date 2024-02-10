package run1;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(Peg peg) {
        return this.getRadius() >= peg.getMinRadius();
    }
}
