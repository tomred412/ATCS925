/**
 * @author: Dermot Lu
 * @since: 2.0
 * <p>
 * V1: this program is a template to represent a point on the cartesian coordinate
 * V2: This version introduces constructors so a Point object can directly be created at a specific location
 */

package Ch8ClassesAndObjects.Point;

public class PointV2 {
    //states (fields, instance variables)
    private int x; //private means only this class/template can modify x. By making x private, we're enforcing encapsulation
    private int y;
    public final int Days_OF_A_WEEK = 7;

    //constructors -> a constructor gets called implicitly only when an object is instantiated
    //a constructor does not have a return type. Its name must be the same as the class name
    public PointV2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointV2() {
        //this.x = 0;
        //this.y = 0;
        this(0, 0);
    }

    //behaviors (methods)
    //setters (mutators)
    public void setLocation(int setX, int setY) {
        x = setX;
        y = setY;
    }

    //override the object's toString method to print the content of the object
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
