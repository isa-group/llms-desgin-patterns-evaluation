package run2;

import original.Ornament;

public class GarlandDecorator extends OrnamentDecorator {

    public GarlandDecorator(Ornament decoratedOrnament) {
        super(decoratedOrnament);
    }

    @Override
    public String ornate() {
        return super.ornate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with Garland";
    }
}
