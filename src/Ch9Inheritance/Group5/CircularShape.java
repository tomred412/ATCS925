/**
 * @author Rapha Strasser
 * @since 1.0
 * V1: this class is an abstract circular shape, which is not meant to be standalone
 */

package Ch9Inheritance.Group5;

/**
 * An abstract base class representing a circular shape.
 * Citation: https://chatgpt.com/c/69724343-d1f8-8333-b6b8-fac588ce7944
 */
public abstract class CircularShape extends AbstractShape {
    /**
     * The radius of the circular shape
     */
    protected double radius;

    /**
     * Constructs a CircularShape with the specified name and radius.
     *
     * @param name   the name of the shape
     * @param radius the radius of the circular shape
     */
    public CircularShape(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    /**
     * Returns the radius of the circular shape.
     *
     * @return the radius of the shape
     */
    public double getRadius() {
        return radius;
    }
}
