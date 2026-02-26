/**
 * This class implements rectangle
 */

package Ch9Inheritance.ShapesV1;

public class RectangleV1 implements ShapesV1 {
    private double h, w;

    public RectangleV1(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public double area() {
        return h * w;
    }

    public double perimeter() {
        return 2 * (h + w);
    }
}
