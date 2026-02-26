/**
 * @since: 1.0
 * V1: this class introduces the concept of interfaces
 */

package Ch9Inheritance.ShapesV1;

//with interface, they are just a set of guidelines that the subclasses have to IMPLEMENT. There is 0% code sharing, unlike inheritance where there is 100% code sharing

public interface ShapesV1 {
    public double area();

    public double perimeter();
}
