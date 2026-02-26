package Ch9Inheritance.ShapesV1;

public class PolymorphismWithInterfacesV1 {
    static void main() {
        CircleV1 c = new CircleV1(1);
        RectangleV1 r = new RectangleV1(4, 7);
        TriangleV1 t = new TriangleV1(5, 12, 13);

        ShapesV1[] myShapes = {c, r, t};
        for (int i = 0; i < myShapes.length; ++i) {
            System.out.println(myShapes[i].area());
            System.out.println(myShapes[i].perimeter());
            System.out.println();
        }
    }
}
