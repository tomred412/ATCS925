/**
 * @author: Dermot Lu
 * @since: 2.0
 * <p>
 * V1: this program is a template to represent a point on the cartesian coordinate
 * V2: This version introduces constructors so a Point object can directly be created at a specific location
 * V3: This version allows the user to calculate distance between 2 Point objects and distance from the origin
 * V4: This version allows the user to check if 2 Point objects are equal
 */

package Ch8ClassesAndObjects.Point;

public class PointV4 {
    //states (fields, instance variables)
    private int x; //private means only this class/template can modify x. By making x private, we're enforcing encapsulation
    private int y;
    public final int Days_OF_A_WEEK = 7;

    //constructors -> a constructor gets called implicitly only when an object is instantiated
    //a constructor does not have a return type. Its name must be the same as the class name
    public PointV4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PointV4() {
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

    public double distance(PointV4 other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double distance() {
        return distance(new PointV4(0, 0));
    }

    //must be "Object" to override
    public boolean equals(Object other) {
        if (other instanceof PointV4) {
            PointV4 o = (PointV4) other;
            return o.x == this.x && o.y == this.y;
        }
        return false;
    }

    //override the object's toString method to print the content of the object
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
