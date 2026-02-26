/**
 * @author: Dermot Lu
 * @since: 1.0
 * <p>
 * V1: this program is a template to represent a point on the cartesian coordinate
 */

package Ch8ClassesAndObjects.Point;

public class PointV1 {
    //states (fields, instance variables)
    public int x;
    public int y;

    //behaviors (methods)
    public void setLocation(int setX, int setY) {
        x = setX;
        y = setY;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
