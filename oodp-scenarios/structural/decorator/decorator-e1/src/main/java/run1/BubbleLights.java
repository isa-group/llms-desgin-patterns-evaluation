package run1;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(Ornament decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String ornate() {
        return super.ornate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
