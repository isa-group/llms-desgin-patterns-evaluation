package run2;

import original.Ornament;

// Base Decorator
public abstract class OrnamentDecorator implements Ornament {
    protected Ornament decoratedOrnament;

    public OrnamentDecorator(Ornament decoratedOrnament) {
        this.decoratedOrnament = decoratedOrnament;
    }

    public String ornate() {
        return decoratedOrnament.ornate();
    }
}