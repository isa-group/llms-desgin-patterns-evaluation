package run1;

public class DecoratorDemo {
    public static void main(String[] args) {
        Ornament tree = new ChristmasTree();
        tree = new BubbleLights(tree);
        tree = new Tinsel(tree);

        System.out.println(tree.ornate());
    }
}