package run2;

import original.ChristmasTree;
import original.Ornament;

public class DecoratorDemo {
    public static void main(String[] args) {
        Ornament christmasTree = new ChristmasTree();
        Ornament treeWithTinsel = new TinselDecorator(christmasTree);
        Ornament treeWithTinselAndGarland = new GarlandDecorator(treeWithTinsel);

        System.out.println(treeWithTinsel.ornate()); // Output: Christmas tree with Tinsel
        System.out.println(treeWithTinselAndGarland.ornate()); // Output: Christmas tree with Tinsel with Garland
    }
}
