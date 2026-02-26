package Ch9Inheritance.ShapesV1;

public class CircleV1 implements ShapesV1 {
    private double r;

    public CircleV1(double r) {
        this.r = r;
    }
    
    public double area() {
        return r * r * Math.PI;
    }

    public double perimeter() {
        return 2 * r * Math.PI;
    }
}
