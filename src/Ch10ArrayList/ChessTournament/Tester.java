package Ch10ArrayList.ChessTournament;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        // This file contains the examples from the instructions
        // You may modify this file, but are not required to

        // === Part A: Testing Round Constructor ===
        System.out.println("=== Part A: Round Constructor ===");

        // three players
        String[] players1 = {"Alex", "Ben", "Cara"};
        Round r1 = new Round(players1);

        System.out.println("Competitors in Round r1:");
        for (Competitor c : r1.getCompetitorList()) {
            System.out.println(c);
        }

        // six players
        String[] players2 = {"Shirley", "Abed", "Britta", "Jeff", "Troy", "Annie"};
        Round r2 = new Round(players2);

        System.out.println("Competitors in Round r1:");
        for (Competitor c : r2.getCompetitorList()) {
            System.out.println(c);
        }


        // === Part B: Testing buildMatches ===
        System.out.println("\n=== Part B: buildMatches ===");

        // Example 1: Odd number of competitors
        System.out.println("Example 1: Odd number of competitors (Alex, Ben, Cara)");
        ArrayList<Match> matches1 = r1.buildMatches();
        for (Match m : matches1) {
            System.out.println(m);
        }

        // Example 2: Even number of competitors
        System.out.println("\nExample 2: Even number of competitors (Rei, Sam, Vi, Tim)");
        String[] players3 = {"Rei", "Sam", "Vi", "Tim"};
        Round r3 = new Round(players3);
        ArrayList<Match> matches2 = r3.buildMatches();
        for (Match m : matches2) {
            System.out.println(m);
        }
    }
}

