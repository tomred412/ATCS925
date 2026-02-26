package Ch7Arrays;

import java.util.Arrays;

public class ArrayTally {

    public static int mostFrequentDigit(int number) {
        if (number == 0) {
            return 0; // A special case for the number 0
        }

        // Step 1: Create an integer array of size 10 [0-9] to store the frequency of each digit.
        int[] frequency = new int[10];

        // Step 2: Loop to extract each digit and update its frequency count.
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        // Step 3: Find the digit with the highest frequency.
        int mostFrequentDigit = -1;
        int maxFrequency = -1;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = i;
            }
        }
        return mostFrequentDigit;
    }

    public static void main(String[] args) {

    }
}