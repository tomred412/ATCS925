/**
 * @author: Yi Cheng See
 * @since: 1.0
 * V1: Abstract class for any circular shape with height including cones and cylinders.
 */
package Ch9Inheritance.Group5;

/**
 * Represents any abstract class that is a circular shape with a height, like cones and cylinders
 */
public abstract class CircularHeightShape extends CircularShape {
    private double height;

    /**
     * @param name   Name of the shape
     * @param radius Radius of the circular section of the circular shape with height
     * @param height Height of the circular shape
     */
    public CircularHeightShape(String name, double radius, double height) {
        super(name, radius);
        this.height = height;
    }

    /**
     * @return The value of the inputted height of the shape
     */
    public double getHeight() {
        return height;
    }
}
