package run1;

public class SquarePegAdapter implements Peg {
    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getMinRadius() {
        // Calculate the minimum radius circle that fits the square peg
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
