/**
 * @author: Dermot Lu
 * @since: 2.0
 * <p>
 * V1: this program allows us to instantiate several shapes
 * V2: this version refactors the code to use abstract inheritance hierarchy
 */

package Ch9Inheritance.ShapesV2;

public class PolymorphismWithInterfacesV2 {
    static void main() {

        ShapesV2[] myShapes = {new CircleV2("Kyle's circle: ", 1), new RectangleV2("Rishi's rectangle: ", 6, 7), new TriangleV2("Arthur's triangle: ", 2, 2, 3)};
        ShapesV2 answer = myShapes[0];
        for (int i = 0; i < myShapes.length; ++i) {
            System.out.println(myShapes[i]);
            if (answer.compareTo(myShapes[i]) < 0) answer = myShapes[i];
        }
        System.out.println(answer.getName());

        // for (var it : myShapes) {
        //   System.out.println(it);
        //}
    }
}
