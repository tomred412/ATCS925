/**
 * @author Rapha Strasser
 * @since 1.0
 * V1: this class inherits from the abstract circular shape and implements a sphere shape
 */

package Ch9Inheritance.Group5;

/**
 * Represents a sphere, a three-dimensional circular shape.
 */
public class Sphere extends CircularShape {

    /**
     * Constructs a Sphere with the specified name and radius.
     *
     * @param name   the name of the sphere
     * @param radius the radius of the sphere
     */
    public Sphere(String name, double radius) {
        super(name, radius);
    }

    /**
     * Calculates and returns the volume of the sphere.
     *
     * @return the volume of the sphere
     */
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates and returns the surface area of the sphere.
     *
     * @return the surface area of the sphere
     */
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
