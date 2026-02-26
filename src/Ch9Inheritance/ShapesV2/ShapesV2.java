/**
 * @since: 1.0
 * V1: this class introduces the concept of interfaces
 * V2: this class introduces the concept of abstract classes
 */

package Ch9Inheritance.ShapesV2;

//with interface, they are just a set of guidelines that the subclasses have to IMPLEMENT. There is 0% code sharing, unlike inheritance where there is 100% code sharing

public abstract class ShapesV2 implements Comparable<ShapesV2> {
    public String name;

    public ShapesV2(String name) {
        this.name = name;
    }

    public int compareTo(ShapesV2 other) {
        return (int) Math.signum(this.area() - other.area());
    }

    public abstract double area();

    public abstract double perimeter();

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n";
    }
}
