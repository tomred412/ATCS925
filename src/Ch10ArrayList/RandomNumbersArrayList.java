/**
 * @author Dermot Lu
 * @since 1.0
 * <p>
 * V1. This program reads numbers from a file and performs several tasks for practicing using ArrayList
 */

package Ch10ArrayList;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumbersArrayList {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("randomNumbers.txt")); //read from the file in root folder
        ArrayList<Integer> a = new ArrayList<>();
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evens = 0;
        int odds;

        while (in.hasNext()) {
            int number = in.nextInt();
            total += number;

            if (max < number) max = number;
            if (min > number) min = number;

            if (number % 2 == 0) ++evens;

            a.add(number);
        }
        System.out.println(a);
        odds = Math.abs(a.size() - evens);

        double average = total / (double) a.size();
        int min_count = 0;
        int max_count = 0;

        for (int i = a.size() - 1; i >= 0; --i) {
            if (a.get(i) > average) ++max_count;
            else if (a.get(i) < average) ++min_count;
            if (a.get(i) % 2 == 0) a.remove(i);
        }

        System.out.println("Average: " + average);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("Number of Evens: " + evens);
        System.out.println("Number of Odds: " + odds);
        System.out.println("Numbers above average: " + max_count);
        System.out.println("Numbers below average: " + min_count);
        System.out.println(a);
    }
}
