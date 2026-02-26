package Ch10ArrayList.ChessTournament;

/**
 * A single competitor in the tournament
 */
public class Competitor {
    /**
     * The competitor's name and rank
     */
    private String name;
    private int rank;

    /**
     * Assigns n to name and initialRank to rank
     * Precondition: initialRank >= 1
     */
    public Competitor(String n, int initialRank) {
        name = n;
        rank = initialRank;

    }

    /* There may be instance variables, constructors,
       and methods that are not shown. */

    public String toString() {
        return "Name: " + name + ", Rank: " + rank;
    }
}

