/**
 * @author: Emma Ha
 * @since: 1.0
 * V1: This class represents an interface of 3D shapes
 */

package Ch9Inheritance.Group5;

/**
 * Represents an interface of any 3D shape
 */
public interface Shapes3D {
    /**
     * Calculates and returns the volume of the 3D shape.
     *
     * @return The volume of the shape in cubic units
     */
    public double getVolume();

    /**
     * Calculates and returns the total surface area of the 3D shape.
     *
     * @return The surface area of the shape in square units
     */
    public double getSurfaceArea();
}
