package run1;

public class Tinsel extends TreeDecorator {
    public Tinsel(Ornament decoratedTree) {
        super(decoratedTree);
    }

    @Override
    public String ornate() {
        return super.ornate() + decorateWithTinsel();
    }

    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}
