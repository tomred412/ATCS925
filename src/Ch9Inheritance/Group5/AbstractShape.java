/**
 * @author: Emma Ha, Dermot Lu
 * @since: 1.0
 * <p>
 * V1: this abstract class implements the Shapes3D interface to have name
 * V2: this abstract class, a 3D shape with a name, now includes a compareTo method to compare 2 abstract shapes
 */

package Ch9Inheritance.Group5;

/**
 * Abstract shape to implement 3D shapes, with a name and compareTo method
 */
public abstract class AbstractShape implements Shapes3D, Comparable<AbstractShape> {
    public String name;

    /**
     *
     * @param name Name of the abstract shape
     */
    public AbstractShape(String name) {
        this.name = name;
    }

    /**
     * Compares this shape to another AbstractShape based on volume
     *
     * @param other The other shape to compare to
     * @return A negative integer, zero, or a positive integer, depending on if this shape's volume is less than, equal to, or greater than the other shape's volume respectively.
     */
    public int compareTo(AbstractShape other) {
        return Double.compare(this.getVolume(), other.getVolume());
    }

    /**
     *
     * @return Name of the abstract shape
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Formatted list of name, volume, and surface area of the abstract shape. The volumes and surface areas are rounded to the nearest hundredth so that real volumes and surface areas are preserved while formatting is enhanced
     */
    public String toString() {
        double roundedVolume = Math.round(getVolume() * 100.0) / 100.0;
        double roundedSurfaceArea = Math.round(getSurfaceArea() * 100.0) / 100.0;
        return "Name: " + name + "\n" +
                "Volume: " + roundedVolume + "\n" +
                "Surface Area: " + roundedSurfaceArea + "\n";
    }
}
