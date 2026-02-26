package Ch7Arrays;
/*
This version does weather analysis on N data points.
It calculates the average temperature and prints how many days are above average.
 */

import java.util.Scanner;

public class DermotLuAssignment1 {
    public static void main(String[] args) {
        //Algorithm:
        //Step 1: Identify the goal "create a weather analysis program that calculates the
        // average of the data points and how many days are above average"
        //Step 2: Design a solution:
        //  Step 0.5: Create scanner object
        Scanner in = new Scanner(System.in);
        //  Step 1: Prompt the user for how many days
        System.out.print("How many days' temperatures? ");
        //  Step 2: Store user input in a variable (Scanner)
        int days = in.nextInt();
        //  Step 2.5: Create an int array of size n from step 2
        int[] temperatures = new int[days];
        //  Step 2.75: Create cumulative variable to store sum
        int sum = 0;
        //  Step 3: Create a loop to run n times, where n represents user input (Step 2)
        for (int i = 0; i < temperatures.length; ++i) {
            //      Step 4: Prompt the user for that day's high temp
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            //      Step 4.5: Store it in the array
            temperatures[i] = in.nextInt();
            //      Step 5: Update cumulative sum variable
            sum += temperatures[i];
        }
        //  Step 6: Calculate average
        double average = (double) sum / days;
        //  Step 7: Create counter variable to keep track of how many days above average
        int count = 0;
        //  Step 8: Create loop to identify how many days above average
        for (int i = 0; i < days; ++i) {
            if (temperatures[i] > average) ++count;
        }
        //  Step 9: Print how many days above average
        System.out.println("Average temp = " + average);
        System.out.println(count + " days were above average.");
        in.close();
    }
}
