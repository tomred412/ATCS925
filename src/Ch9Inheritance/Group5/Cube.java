/**
 * @author: Rapha Strasser, Dermot Lu
 * @since: 1.0
 * V1: this class represents a cube, which is a special type of rectangular prism
 */

package Ch9Inheritance.Group5;

/**
 * Represents a cube, a special type of rectangular prism
 */
public class Cube extends RectangularPrism {

    /**
     * Constructs a Cube with the specified name and side length.
     *
     * @param name the name of the cube
     * @param side the length of each side of the cube
     */
    public Cube(String name, double side) {
        super(name, side, side, side);
    }

    /**
     * Returns the length of one side of the cube.
     *
     * @return the side length of the cube
     */
    public double getSide() {
        return getWidth();
    }

    /**
     * Calculates and returns the volume of the cube.
     *
     * @return the volume of the cube
     */
    public double getVolume() {
        return Math.pow(getWidth(), 3);
    }

    /**
     * Calculates and returns the surface area of the cube.
     *
     * @return the surface area of the cube
     */
    public double getSurfaceArea() {
        return getWidth() * getWidth() * 6;
    }
}
