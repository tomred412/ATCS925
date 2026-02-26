package Ch10ArrayList.ChessTournament;

/**
 * A match between two competitors
 */
public class Match {
    Competitor[] players;


    public Match(Competitor one, Competitor two) {
        players = new Competitor[2];
        players[0] = one;
        players[1] = two;

    }

    public String toString() {
        return players[0].toString() + " vs. " + players[1].toString();
    }

    /* There may be instance variables, constructors,
       and methods that are not shown. */
}

