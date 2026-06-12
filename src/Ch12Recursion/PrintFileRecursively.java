package Ch12Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintFileRecursively {

    public static void iterativeFileProcessing(Scanner in) {
        while (in.hasNext()) {
            String word = in.nextLine();
            for (int i = word.length() - 1; i >= 0; --i) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }

    public static void recursiveFileProcessing(Scanner in) {
        if (!in.hasNextLine()) {
            System.out.println();
        } else {
            String word = in.nextLine();
            recursiveFileProcessing(in);
            System.out.print(word + " ");
        }
    }

    static void main() throws FileNotFoundException {
        //Step 1: download stopWords.txt from Classroom

        //Step 2: put the file in the "root" folder

        //Step 3: create a File object

        //Step 4: create a Scanner object using the File object from Step 3
        Scanner in = new Scanner(new File("stopWords.txt"));

        //Step 5: create a method called iterativeFileProcessing to process all words from the file using a while loop and print them backwards
        iterativeFileProcessing(in);

        //Step 6: create a method called RecursiveFileProcessing to process all words from the file and using recursion print them backwards
        recursiveFileProcessing(in);
    }
}
