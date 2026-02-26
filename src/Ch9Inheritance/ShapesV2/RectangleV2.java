/**
 * This class implements rectangle
 */

package Ch9Inheritance.ShapesV2;

public class RectangleV2 extends ShapesV2 {
    private double h, w;

    public RectangleV2(String name, double h, double w) {
        super(name);
        this.h = h;
        this.w = w;
    }

    public double area() {
        return h * w;
    }

    public double perimeter() {
        return 2 * (h + w);
    }
    //setters

    //toString

}
