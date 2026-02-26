package Ch7Arrays;
/*
V1: This version does weather analysis on N data points.
It calculates the average temperature and prints how many days are above average.
V2: This version adds two new features. First, we print the entire dataset that is stored in the array.
Second, we print the 2 coldest and 2 hottest days of the dataset.
V3: This version will break up everything into methods. There will be a method to get the input from the user, a method to say the temperature average and above average, and a method to output the temperatures and highest/lowest temps. We will use global variables to reduce redundancies and for the convenience. Finally, we will return all methods to the main method for the control flow and close the scanner.
V4: This version contains the weather data in a text file. This version is a review of file processing.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class DermotLuAssignment4 {
    public static int days;
    public static int[] temperatures;
    public static double average;

    public static void getUserInput(Scanner in) {
        //  Step 1: Prompt the user for how many days
        // System.out.print("How many days' temperatures? ");
        //  Step 2.25: Early exit
        if (days <= 1) {
            System.out.println("You should probably have at least two temperatures.");
            System.exit(1);
        }
        //  Step 2.5: Create an int array of size n from step 2
        temperatures = new int[days];

        //  Step 2.75: Create cumulative variable to store sum
        average = 0;
        //  Step 3: Create a loop to run n times, where n represents user input (Step 2)
        /*
        for (int i = 0; i < temperatures.length; ++i) {
            //      Step 4: Prompt the user for that day's high temp
         */
        int i = 0;
        while (in.hasNextInt()) {
            //      Step 4.5: Store it in the array
            temperatures[i] = in.nextInt();
            //      Step 5: Update cumulative sum variable
            average += temperatures[i];
            ++i;
        }
        //  Step 6: Calculate average
        average /= days;
    }

    public static void stateAveragesOfTemp(PrintStream out) {
        //  Step 7: Create counter variable to keep track of how many days above average
        int count = 0;
        //  Step 8: Create loop to identify how many days above average
        for (var it : temperatures) {
            if (it > average) ++count;
        }
        //  Step 9: Print how many days above average
        out.println("Average temp = " + Math.round(average * 10.0) / 10.0);
        out.println(count + " days were above average.");
    }

    public static void stateTemperatures(PrintStream out) {
        //  Step 10: Print the array:
        out.println("\nTemperatures: " + Arrays.toString(temperatures));
        //  Step 11: Print the two coldest and hottest temperatures by sorting array
        Arrays.sort(temperatures);
        out.println("Two coldest days: " + temperatures[0] + ", " + temperatures[1] + "\nTwo hottest days: " + temperatures[days - 1] + ", " + temperatures[days - 2]);
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Algorithm:
        //Step 1: Identify the goal "create a weather analysis program that calculates the
        // average of the data points and how many days are above average"
        //Step 2: Design a solution:
        //  Step 0.5: Create a file objects and a scanner object to link the file
        Scanner in = new Scanner(new File("weather.txt"));
        days = in.findAll("\n").toArray().length + 1;
        in.close();
        Scanner in1 = new Scanner(new File("weather.txt"));
        PrintStream out = new PrintStream("weatherAnalysisOutput.txt");

        getUserInput(in1);
        stateAveragesOfTemp(out);
        stateTemperatures(out);

        in1.close();
        out.close();
    }
}
