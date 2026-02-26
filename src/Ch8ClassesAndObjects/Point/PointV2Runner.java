/**
 * @author: Dermot Lu
 * @since: 2.0
 * <p>
 * V1: This program allows us to instantiate PointV1 objects and call some functions on them.
 */

package Ch8ClassesAndObjects.Point;

public class PointV2Runner {
    public static void main(String[] args) {
        //instantiate a PointV1 object at (3, 5) -> whenever you use the keyword new, you're instantiating an object
        PointV2 a = new PointV2(3, 5); //a(0, 0)
        System.out.println(a); //toString is called implicitly. Do not explicitly call it
    }
}
