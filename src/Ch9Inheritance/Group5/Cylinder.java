/**
 * @author: Yi Cheng See
 * @since: 1.0
 * <p>
 * V1: Class representing any cylindrical shape with 2 circular faces and a height, allowing you to find the volume and surface area of the shape.
 */
package Ch9Inheritance.Group5;

/**
 * Represents a cylinder, which has 2 circular faces and a height
 */
public class Cylinder extends CircularHeightShape {
    /**
     * @param name   Name of the shape
     * @param radius Radius of both circular faces of the cylindrical shape
     * @param height Height of the cylinder
     */
    public Cylinder(String name, double radius, double height) {
        super(name, radius, height);
    }

    /**
     * @return The volume of the cylinder using formula pi*r^2*r
     */
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * getHeight();
    }

    /**
     * @return The surface area of the cylinder using formula 2*pi*r*h + 2*pi*r^2
     */
    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * Math.pow(getRadius(), 2);
    }
}
