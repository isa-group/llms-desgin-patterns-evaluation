package run2;

import original.Ornament;

public class TinselDecorator extends OrnamentDecorator {

    public TinselDecorator(Ornament decoratedOrnament) {
        super(decoratedOrnament);
    }

    @Override
    public String ornate() {
        return super.ornate() + decorateWithTinsel();
    }

    private String decorateWithTinsel() {
        return " with Tinsel";
    }
}
