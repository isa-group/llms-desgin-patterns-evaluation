package run1;

public abstract class TreeDecorator implements Ornament {
    protected Ornament decoratedTree;

    public TreeDecorator(Ornament decoratedTree) {
        this.decoratedTree = decoratedTree;
    }

    public String ornate() {
        return decoratedTree.ornate();
    }
}
