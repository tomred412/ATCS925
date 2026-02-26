package Ch10ArrayList.ChessTournament;

import java.util.ArrayList;

/**
 * A single round of the tournament
 */
public class Round {
    /**
     * The list of competitors participating in this round
     */
    private ArrayList<Competitor> competitorList;

    /**
     * Initializes competitorList, as described in part (a)
     */
    public Round(String[] names) {
        /* to be implemented in part (a) */
        competitorList = new ArrayList<>();
        for (int i = 0; i < names.length; ++i) {
            Competitor temp = new Competitor(names[i], i + 1);
            competitorList.add(temp);
        }

    }

    /**
     * Creates an ArrayList of Match objects for the next round
     * of the tournament, as described in part (b)
     * Preconditions: competitorList contains at least one element.
     * competitorList is ordered from best to worst rank.
     * Postcondition: competitorList is unchanged.
     */
    public ArrayList<Match> buildMatches() {
        /* to be implemented in part (b) */
        ArrayList<Match> a = new ArrayList<>();
        if (competitorList.size() % 2 == 1) {
            for (int i = 1; i <= competitorList.size() / 2; ++i) {
                Match temp = new Match(competitorList.get(i), competitorList.get(competitorList.size() - i));
                a.add(temp);
            }
        } else {
            for (int i = 0; i < competitorList.size() / 2; ++i) {
                Match temp = new Match(competitorList.get(i), competitorList.get(competitorList.size() - i - 1));
                a.add(temp);
            }
        }
        return a;
    }

    /* There may be instance variables, constructors,
       and methods that are not shown. */

    /**
     * Returns the list of competitors (for testing).
     */
    public ArrayList<Competitor> getCompetitorList() {
        return competitorList;
    }

}

