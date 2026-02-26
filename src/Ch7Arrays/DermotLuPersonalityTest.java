package Ch7Arrays;

import java.util.Scanner;
import java.io.*;

/**
 * This program processes a file, whose location is determined by the user, of Keirsey personality test data and determines the personality type of the test taker.
 * More specifically, it reads a file that contains names and responses to 70 questions, and then calculates the scores for the four personality dimensions. Then, it prints the results to an output file determined by the user.
 *
 * @author Dermot Lu
 */

public class DermotLuPersonalityTest {

    /**
     * This class stores a single person's personality data.
     */
    static class PersonalityData {
        /**
         * This stores the name of the person
         */
        public String name;
        /**
         * This stores the count of 'A' responses in each dimension (0, 1, 2, 3)
         */
        public int[] a_count = new int[4];
        /**
         * This stores the count of 'B' responses in each dimension (0, 1, 2, 3)
         */
        public int[] b_count = new int[4];

        public PersonalityData(String name, int[] A_count, int[] B_count) {
            this.name = name;
            this.a_count = A_count;
            this.b_count = B_count;
        }
    }

    /**
     * This method prompts the user until it is given a valid input file name
     *
     * @param console A Scanner object to read user input from the console
     * @return A File object containing the pre-existing input file
     */
    public static File getInputFile(Scanner console) {
        System.out.print("Input file name: ");
        String input_file = console.next();

        while (!(new File(input_file).exists())) { //until we are given a valid input file, continue prompting the user
            System.out.print("File not found. Try again: ");
            input_file = console.next();
        }
        return new File(input_file);
    }

    /**
     * This method prompts the user for an output file
     *
     * @param console A scanner object to read user input from the console
     * @return A File object representing the output file
     */
    public static File getOutputFile(Scanner console) {
        System.out.print("Output file name: ");
        String output_file = console.next();
        File file = new File(output_file);

        if (file.exists()) {
            System.out.println("This file already exists. Would you like to overwrite it? (y/n)");
            String response = console.next();
            if (!response.equalsIgnoreCase("y")) {
                return getOutputFile(console);
            }
        }
        return file;
    }

    /**
     * This method processes the data for a single person from the input file.
     * It reads the person's name and 70 responses, calculates the 'A' and 'B' counts for each of the four dimensions, and returns the data in a singular PersonalityData object for convenience.
     *
     * @param in A Scanner object which reads from the input file
     * @return A PersonalityData object which contains the person's name and 'A' and 'B' counts
     */
    public static PersonalityData processOnePerson(Scanner in) {
        String name = in.nextLine();
        String personalResponses = in.nextLine();
        personalResponses = personalResponses.toUpperCase();
        int[] a_count = new int[4];
        int[] b_count = new int[4];
        int[] mod_lookup = {0, 1, 1, 2, 2, 3, 3}; //we can use a mod_lookup array to look up the dimensions during the loop. This is because the questions are presented in groups of 7, following a 1-2-2-2 format. The array can be described as a more elegant solution than a block of if statements
        for (int i = 0; i < personalResponses.length(); ++i) {
            int lookup_index = mod_lookup[i % 7];
            if (personalResponses.charAt(i) != '-') {
                if (personalResponses.charAt(i) == 'A') {
                    ++a_count[lookup_index];
                } else {
                    ++b_count[lookup_index];
                }
            }
        }
        return new PersonalityData(name, a_count, b_count);
    }

    /**
     * This method formats and prints the test results for a single person to the output file. It uses an object, PersonalityData, obtained from the processOnePerson method.
     * This includes 'A' and 'B' counts, percentages of B answers, and the final personality type.
     *
     * @param thisPerson A PersonalityData object containing data for the person to be printed
     * @param out        A PrintStream object which prints to the output file
     */

    public static void formatAndPrintResults(PersonalityData thisPerson, PrintStream out) {
        out.println(thisPerson.name + ":");
        double[] percentages = new double[4];
        for (int i = 0; i < 4; ++i) {
            out.print(thisPerson.a_count[i] + "A-" + thisPerson.b_count[i] + "B ");
            percentages[i] = (double) thisPerson.b_count[i] * 100 / (thisPerson.b_count[i] + thisPerson.a_count[i]);
        }
        out.print("\n" + "[");
        for (int i = 0; i < 3; ++i) {
            out.print(Math.round(percentages[i]) + "%, ");
        }
        out.print(Math.round(percentages[3]) + "%] = ");

        String personality_type = "";
        String[] type_a_lookup = {"E", "S", "T", "J"};
        String[] type_b_lookup = {"I", "N", "F", "P"};

        //Use arrays and a loop as a more graceful way to avoid a bunch of if statements
        for (int i = 0; i < 4; ++i) {
            if (percentages[i] > 50) {
                personality_type += type_b_lookup[i];
            } else if (percentages[i] < 50) {
                personality_type += type_a_lookup[i];
            } else {
                personality_type += "X";
            }
        }
        out.println(personality_type + "\n");
    }

    /**
     * The main method manages the program. First, it uses the other methods to control input and output files. Finally, it uses the other methods to process and output each person's data from the input file.
     *
     * @param args Command line arguments
     * @throws FileNotFoundException If the input file is not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in); //let's create a scanner object for just the console
        Scanner in = new Scanner(getInputFile(console));
        PrintStream out = new PrintStream(getOutputFile(console));

        while (in.hasNext()) {
            formatAndPrintResults(processOnePerson(in), out);
        }
        in.close();
        out.close();
        console.close();
    }
}
