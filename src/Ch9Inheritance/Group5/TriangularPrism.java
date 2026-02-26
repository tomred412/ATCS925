/**
 * @author Dermot Lu
 * @since 1.0
 * <p>
 * V1: This class represents a triangular prism. It inherits from its abstract parent class, which represents any type of prism.
 */

package Ch9Inheritance.Group5;

/**
 * Represents a triangular prism, which has 2 triangular faces (with 3 sides) and a height
 */
public class TriangularPrism extends Prism {
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Creates a new triangular prism with the characteristics given
     *
     * @param name   name of the triangular prism
     * @param height height of the triangular prism
     * @param sideA  first side of the triangular base of the prism
     * @param sideB  second side of the triangular base of the prism
     * @param sideC  third side of the triangular base of the prism
     */
    public TriangularPrism(String name, double height, double sideA, double sideB, double sideC) {
        super(name, height);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     *
     * @return first side of the triangular base of the prism
     */
    public double getSideA() {
        return sideA;
    }

    /**
     *
     * @return second side of the triangular base of the prism
     */
    public double getSideB() {
        return sideB;
    }

    /**
     *
     * @return third side of the triangular base of the prism
     */
    public double getSideC() {
        return sideC;
    }

    /**
     * Helper method to calculate the triangular base's area of the triangular prism
     *
     * @return the area of the triangular base
     */
    private double getTriangleArea() {
        double s = (sideA + sideB + sideC) / 2.0;
        double triangleArea = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return triangleArea;
    }

    /**
     * Calculates the volume of the triangular prism
     *
     * @return calculation of the volume of the triangular prism
     */
    public double getVolume() {
        return getTriangleArea() * getHeight();
    }

    /**
     * Calculates the surface area of the triangular prism, including the two triangular bases and three rectangular sides
     *
     * @return calculation of the surface area of the triangular prism
     */
    public double getSurfaceArea() {
        double lateralArea = (sideA + sideB + sideC) * getHeight();
        return 2 * getTriangleArea() + lateralArea;
    }
}
