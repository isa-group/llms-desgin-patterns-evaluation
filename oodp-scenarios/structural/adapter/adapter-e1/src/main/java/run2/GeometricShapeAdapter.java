package run1;
import original.GeometricShape;
import original.Shape;

public class GeometricShapeAdapter implements Shape {
    private GeometricShape geometricShape;

    public GeometricShapeAdapter(GeometricShape geometricShape) {
        this.geometricShape = geometricShape;
    }

    @Override
    public void draw() {
        geometricShape.drawShape();
    }

    @Override
    public void resize() {
        // As geometric shapes do not directly support resize, this can be a no-op or log a message.
        System.out.println("Resizing not supported for geometric shape.");
    }

    @Override
    public String description() {
        // This returns a generic description; you might want to customize it for each shape.
        return "Adapter for GeometricShape";
    }

    @Override
    public boolean isHide() {
        // This implementation assumes geometric shapes are always visible.
        return false;
    }
}
