/**
 * @author: Emma Ha, Dermot Lu
 * @since: 1.0
 * <p>
 * V1: this program allows us to instantiate several 3D shapes
 * V2: this program instantiates several 3D shapes, prints them unordered, sorts them, and then prints them sorted based on their volumes
 */

package Ch9Inheritance.Group5;

import java.util.Arrays;

/**
 * Runner class to test the implementation of 3D shapes
 */
public class Shapes3DRunner {
    public static void main(String[] args) {
        Shapes3D[] shapes = {
                new Sphere("Rapha's sphere", 7),
                new Cylinder("Yi Cheng's cylinder", 5, 9),
                new Cone("Yi Cheng's cone", 4, 7),
                new TriangularPrism("Dermot's triangular prism", 45, 5, 12, 13),
                new RectangularPrism("Dermot's rectangular prism", 77, 2, 5),
                new Cube("Rapha's cube", 7)
        };
        System.out.println("--------------------------------\nShapes before sorted:\n--------------------------------");
        for (var it : shapes) {
            System.out.println(it);
        }

        Arrays.sort(shapes);

        System.out.println("\n--------------------------------\nShapes after sorted by volume:\n--------------------------------");
        for (var it : shapes) {
            System.out.println(it);
        }
    }
}
