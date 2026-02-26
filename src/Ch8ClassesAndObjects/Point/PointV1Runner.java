/**
 * @author: Dermot Lu
 * @since: 1.0
 * <p>
 * V1: This program allows us to instantiate PointV1 objects and call some functions on them.
 */

package Ch8ClassesAndObjects.Point;

public class PointV1Runner {
    public static void main(String[] args) {
        //instantiate a PointV1 object at (3, 5) -> whenever you use the keyword new, you're instantiating an object
        PointV1 a = new PointV1(); //a(0, 0)
        System.out.println("(" + a.x + ", " + a.y + ")");
        a.x = 1;
        a.y = 5;
        System.out.println("(" + a.x + ", " + a.y + ")");
        a.setLocation(3, 5);
        System.out.println("(" + a.x + ", " + a.y + ")");
    }
}
