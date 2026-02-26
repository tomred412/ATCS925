/**
 * @author: Yi Cheng See
 * @since: 1.0
 * <p>
 * V1: Class representing any cone shape with a circular base and height, allowing you to find the volume and surface area of the shape.
 */
package Ch9Inheritance.Group5;

/**
 * Represents a cone, which has a circular base and height
 */
public class Cone extends CircularHeightShape {
    /**
     * @param name   Name of the shape
     * @param radius Radius of the circular base of the cone
     * @param height Value of the height of the cone from the center of the circular base to the tip of the cone
     */
    public Cone(String name, double radius, double height) {
        super(name, radius, height);
    }

    /**
     * @return The volume of the cone shape using formula pi*r^2*(h/3)
     */
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * (getHeight() / 3);
    }

    /**
     * @return The surface area of the cone shape using formula pi*r*(r+sqrt(h^2 + r^2))
     */
    public double getSurfaceArea() {
        return Math.PI * getRadius() * (getRadius() + Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2)));
    }
}
