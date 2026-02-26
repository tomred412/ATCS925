/**
 * @author Dermot Lu
 * This represents a singular DVD.
 */

package Ch8ClassesAndObjects.MovieCollection;

import java.text.DecimalFormat;

public class DVD {
    /**
     * Title of the DVD movie
     */
    private String title;
    /**
     * Director of the DVD movie
     */
    private String director;
    /**
     * Year released of the DVD movie
     */
    private int year;
    /**
     * Cost of the DVD
     */
    private double cost;
    /**
     * Represents whether or not the DVD is a blueray
     */
    private boolean blueray;

    /**
     * Constructs a new DVD object with its details
     *
     * @param title    The movie's title
     * @param director The movie's director
     * @param year     The movie's release year
     * @param cost     The DVD's cost
     * @param blueray  Whether or not the DVD is a blueray
     */

    public DVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * Returns a string representation of the DVD, formatted correctly
     *
     * @return A formatted string of the cost, year, title, director, and blueray
     */
    public String toString() {
        return String.format("$%-8.2f%-5s%-20s%-25s%-7s", cost, year, title, director, ((blueray) ? "Blue-Ray" : ""));
    }
}
