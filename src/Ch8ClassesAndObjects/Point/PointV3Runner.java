/**
 * @author: Dermot Lu
 * @since: 2.0
 * <p>
 * V1: This program allows us to instantiate PointV1 objects and call some functions on them.
 * V2: This version allows us to instantiate a Point object with 2 parameters. This version introduces constructors and encapsulation
 * V3:
 */

package Ch8ClassesAndObjects.Point;

public class PointV3Runner {
    public static void main(String[] args) {
        //instantiate a PointV3 object at (3, 5) -> whenever you use the keyword new, you're instantiating an object
        PointV3 a = new PointV3(3, 4); //a(0, 0)
        System.out.println(a); //toString is called implicitly. Do not explicitly call it
        PointV3 b = new PointV3();
        System.out.println(a.distance(b));
        System.out.println(a.distance(new PointV3(0, 0)));
        if (a.equals(b)) {
            System.out.println("Same points!");
        } else {
            System.out.println("Different points!");
        }
    }
}
