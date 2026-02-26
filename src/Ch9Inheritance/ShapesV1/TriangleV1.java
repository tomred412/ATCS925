/**
 * This class implements triangle
 */

package Ch9Inheritance.ShapesV1;

public class TriangleV1 implements ShapesV1 {
    //fields
    private double a, b, c;

    //constructors
    public TriangleV1(double a, double b, double c) {
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
