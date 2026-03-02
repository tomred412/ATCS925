package Ch7Arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printMultTable(int[][] table) {
        for (int i = 0; i < table.length; ++i) {
            for (int j = 0; j < table[i].length; ++j) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void populateMultTable(int[][] table, int start, int end) {
        for (int i = 0; i < end - start + 1; ++i) {
            for (int j = 0; j < end - start + 1; ++j) {
                table[i][j] = (start + i) * (start + j);
            }
        }
    }

    static void main() {
        System.out.println("Please select the starting and ending points of the multiplication table in this format: '{start_int} {end_int}':");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();

        int[][] table = new int[end - start + 1][end - start + 1];
        populateMultTable(table, start, end);
        printMultTable(table);
    }
}
