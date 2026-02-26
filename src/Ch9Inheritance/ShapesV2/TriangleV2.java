/**
 * This class implements triangle
 */

package Ch9Inheritance.ShapesV2;

public class TriangleV2 extends ShapesV2 {
    //fields
    private double a, b, c;

    //constructors
    public TriangleV2(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getters
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    //setters

    //toString

}
