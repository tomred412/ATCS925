/**
 * @author Dermot Lu
 * @since: 1.0
 * Manages a collection of DVDs. Allows adding DVDs and provides a summary of the collection.
 */

package Ch8ClassesAndObjects.MovieCollection;

import java.text.DecimalFormat;
import java.util.Arrays;

public class DVDCollection {
    /**
     * An array of DVDs
     */
    private DVD[] collection;
    /**
     * The current number of DVDs
     */
    private int count;
    /**
     * The cumulative cost of all DVDs
     */
    private double totalCost;

    /**
     * Constructs a new, empty DVD collection
     */
    public DVDCollection() {
        collection = new DVD[]{};
        count = 0;
        totalCost = 0;
    }

    /**
     * Creates a new DVD object with the given details and adds it to the collection.
     * The collection array is automatically resized
     *
     * @param title    The movie's title.
     * @param director The movie's director.
     * @param year     The movie's release year.
     * @param cost     The price of the DVD.
     * @param blueray  True if the DVD is Blu-ray, false otherwise.
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray) {
        ++count;
        totalCost += cost;
        if (count >= collection.length) increaseSize();
        collection[count - 1] = new DVD(title, director, year, cost, blueray);
    }

    /**
     * Private method to increase the size of the collection by one
     */
    private void increaseSize() {
        collection = Arrays.copyOf(collection, collection.length + 1);
    }

    /**
     * Returns a string representation of the entire DVD collection,
     * including a summary (count, total cost, average cost) and a list of all DVDs
     *
     * @return A formatted string summarizing the collection and listing each DVD
     */
    public String toString() {
        DecimalFormat temp = new DecimalFormat("0.00");
        double average = Math.round((totalCost / (double) count) * 100.0) / 100.0;
        String rounded_cost = temp.format(totalCost);

        String output = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMy DVD Collection\n\nNumber of DVDs: " + count + "\nTotal Cost: $" + rounded_cost + "\nAverage Cost: $" + average + "\n\nDVD List:\n\n";

        for (var it : collection) {
            output += it + "\n";
        }
        return output;
    }
}
