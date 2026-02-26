package Ch7Arrays;

import java.util.*;
import java.lang.*;

public class Old {
    public static void main(String[] args) {
        System.out.print("How many days' temperatures? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("There cannot be 0 or negative days.");
            System.exit(1);
        }

        int temperatures[] = new int[n];
        double average = 0;
        for (int i = 0; i < n; ++i) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = in.nextInt();
            average += temperatures[i];
        }
        average /= n;
        System.out.println("Average temp = " + Math.round(average * 10.0) / 10.0);
        int count = 0;

        for (int i = 0; i < n; ++i) {
            if (temperatures[i] > average) {
                ++count;
            }
        }
        System.out.println(count + " days were above average.\n");

        System.out.print("Temperatures: [" + temperatures[0]);
        for (int i = 1; i < n; ++i) {
            System.out.print(", " + temperatures[i]);
        }

        Arrays.sort(temperatures);
        if (n >= 2) {
            System.out.println("]\nTwo coldest days: " + temperatures[0] + ", " + temperatures[1] + "\nTwo hottest days: " + temperatures[n - 1] + ", " + temperatures[n - 2]);
        } else {
            System.out.println("]\nColdest day: " + temperatures[0] + "\nHottest day: " + temperatures[0]);
        }
        in.close();
    }
}