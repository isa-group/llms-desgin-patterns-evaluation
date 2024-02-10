package original;
public class Main {

    public static void main(String[] args) {

          System.out.println("Creating drawing of shapes...");
          Drawing drawing = new Drawing();
          drawing.addShape(new Rectangle());
          drawing.addShape(new Circle());
          drawing.addShape(new Triangle());
          drawing.addShape(new Rhombus());


          System.out.println("Drawing...");
          drawing.draw();
          System.out.println("Resizing...");
          drawing.resize();
    }

}
