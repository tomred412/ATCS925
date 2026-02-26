package Ch9Inheritance.ShapesV2;

public class CircleV2 extends ShapesV2 {
    private double r;

    public CircleV2(String name, double r) {
        super(name);
        this.r = r;
    }

    public double area() {
        return r * r * Math.PI;
    }

    public double perimeter() {
        return 2 * r * Math.PI;
    }

    //setters

    //toString

}
