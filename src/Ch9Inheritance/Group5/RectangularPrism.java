/**
 * @author Dermot Lu
 * @since 1.0
 * V1: This class represents a rectangular prism. It inherits from its parent class, which represents any type of prism.
 */

package Ch9Inheritance.Group5;

/**
 * Represents a rectangular prism shape, which has a height, length, and width
 */
public class RectangularPrism extends Prism {
    private double length;
    private double width;

    /**
     * Creates a new rectangular prism with the characteristics given
     *
     * @param name   Name of the rectangular prism
     * @param height Vertical height of the rectangular prism
     * @param length Length of the rectangular prism
     * @param width  Width of the rectangular prism
     */
    public RectangularPrism(String name, double height, double length, double width) {
        super(name, height);
        this.length = length;
        this.width = width;
    }

    /**
     *
     * @return The length of the rectangular prism
     */
    public double getLength() {
        return length;
    }

    /**
     *
     * @return The width of the rectangular prism
     */
    public double getWidth() {
        return width;
    }

    /**
     * Calculates the volume of the rectangular prism using the formula: width * length * height
     *
     * @return Calculation of the volume of the rectangular prism
     */
    public double getVolume() {
        return width * length * getHeight();
    }

    /**
     * Calculates the surface area of the rectangular prism by summing the six rectangular sides
     *
     * @return Calculation of the surface area of the rectangular prism
     */
    public double getSurfaceArea() {
        return 2 * (width * length + getHeight() * length + getHeight() * width);
    }
}
