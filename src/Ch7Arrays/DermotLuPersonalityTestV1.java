package Ch7Arrays;

import java.util.Scanner;
import java.io.*;

public class DermotLuPersonalityTestV1 {
    static class PersonalityData {
        public String name;
        public int[] A_count = new int[4];
        public int[] B_count = new int[4];

        public PersonalityData(String name, int[] A_count, int[] B_count) {
            this.name = name;
            this.A_count = A_count;
            this.B_count = B_count;
        }
    }

    public static File getInputFile(Scanner console) {
        System.out.print("Input file name: ");
        String input_file = console.next();

        while (!(new File(input_file).exists())) { //until we are given a valid input file, continue prompting the user
            System.out.print("File not found. Try again: ");
            input_file = console.next();
        }
        return new File(input_file);
    }

    public static File getOutputFile(Scanner console) {
        System.out.print("Output file name: ");
        String output_file = console.next();
        return new File(output_file);
    }

    public static PersonalityData processOnePerson(Scanner in) {
        String name = in.nextLine();
        String personalResponses = in.nextLine();
        personalResponses = personalResponses.toUpperCase();
        int[] A_count = new int[4];
        int[] B_count = new int[4];
        for (int i = 0; i < personalResponses.length(); ++i) {
            if (i % 7 == 0) { //let's purposely ignore any "-" so it gets ignored
                if (personalResponses.charAt(i) == 'A') {
                    ++A_count[0];
                } else if (personalResponses.charAt(i) == 'B') {
                    ++B_count[0];
                }
            } else if (i % 7 == 1 || i % 7 == 2) {
                if (personalResponses.charAt(i) == 'A') {
                    ++A_count[1];
                } else if (personalResponses.charAt(i) == 'B') {
                    ++B_count[1];
                }
            } else if (i % 7 == 3 || i % 7 == 4) {
                if (personalResponses.charAt(i) == 'A') {
                    ++A_count[2];
                } else if (personalResponses.charAt(i) == 'B') {
                    ++B_count[2];
                }
            } else {
                if (personalResponses.charAt(i) == 'A') {
                    ++A_count[3];
                } else if (personalResponses.charAt(i) == 'B') {
                    ++B_count[3];
                }
            }
        }
        return new PersonalityData(name, A_count, B_count);
    }

    public static void formatAndPrintResults(PersonalityData thisPerson, PrintStream out) {
        out.println(thisPerson.name);
        double[] percentages = new double[4];
        for (int i = 0; i < 4; ++i) {
            out.print(thisPerson.A_count[i] + "A-" + thisPerson.B_count[i] + "B ");
            percentages[i] = (double) thisPerson.B_count[i] * 100 / (thisPerson.B_count[i] + thisPerson.A_count[i]);
        }
        out.print("\n" + "[");
        for (int i = 0; i < 3; ++i) {
            out.print(Math.round(percentages[i]) + "%, ");
        }
        out.print(Math.round(percentages[3]) + "%] = ");

        String personality_type = "";
        if (percentages[0] > 50) {
            personality_type += "I";
        } else if (percentages[0] < 50) {
            personality_type += "E";
        } else {
            personality_type += "X";
        }
        if (percentages[1] > 50) {
            personality_type += "N";
        } else if (percentages[1] < 50) {
            personality_type += "S";
        } else {
            personality_type += "X";
        }
        if (percentages[2] > 50) {
            personality_type += "F";
        } else if (percentages[2] < 50) {
            personality_type += "T";
        } else {
            personality_type += "X";
        }
        if (percentages[3] > 50) {
            personality_type += "P";
        } else if (percentages[3] < 50) {
            personality_type += "J";
        } else {
            personality_type += "X";
        }

        out.println(personality_type + "\n");
    }

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
