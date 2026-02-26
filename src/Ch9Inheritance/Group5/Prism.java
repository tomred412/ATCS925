/**
 * @author: Emma Ha
 * @since: 1.0
 * V1: This version represents an abstract prism shape, which is not meant to be standalone.
 */

package Ch9Inheritance.Group5;

/**
 * Represents an abstract base prism shape
 */
public abstract class Prism extends AbstractShape {
    public double height;

    /**
     *
     * @param name   Name of the prism
     * @param height Vertical height of the prism
     */
    public Prism(String name, double height) {
        super(name);
        this.height = height;
    }

    /**
     *
     * @return Height of the prism
     */
    public double getHeight() {
        return height;
    }

}
