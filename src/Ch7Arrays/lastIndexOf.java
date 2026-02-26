package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lastIndexOf {
    public static int lastIndexOf(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int countInRange(int[] array, int min, int max) {
        int count = 0;
        for (var it : array) {
            if (it <= max && it >= min) ++count;
        }
        return count;
    }

    public static int range(int[] array) {
        int min = array[0];
        int max = array[0];
        for (var it : array) {
            if (it > max) max = it;
            if (it < min) min = it;
        }
        return max - min + 1;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i + 1] < array[i]) return false;
        }
        return true;
    }

    public static double percentEven(int[] array) {
        double even_count = 0.0;
        for (var it : array) {
            if (it % 2 == 0) ++even_count;
        }
        return Math.round(1000.0 * (even_count / array.length)) / 10.0;
    }

    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] == array[j]) return false;
            }
        }
        return true;
    }

    public static int priceIsRight(int[] bids, int guess) {
        int answer = -1;
        for (var it : bids) {
            if (it <= guess && it >= answer) answer = it;
        }
        return answer;
    }

    public static int longestSortedSequence(int[] array) {
        int count = 1;
        int max_count = 0;
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i + 1] >= array[i]) {
                ++count;
                if (count > max_count) max_count = count;
            } else {
                count = 1;
            }
        }
        return max_count;
    }

    public static int[] append(int[] array1, int[] array2) {
        int[] answer = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; ++i) {
            answer[i] = array1[i];
        }
        for (int i = 0; i < array2.length; ++i) {
            answer[i + array1.length] = array2[i];
        }
        return answer;
    }

    public static int[] vowelCount(String thing) {
        int[] vowel_count = new int[5];
        for (int i = 0; i < thing.length(); ++i) {
            if (thing.charAt(i) == 'a') ++vowel_count[0];
            if (thing.charAt(i) == 'e') ++vowel_count[1];
            if (thing.charAt(i) == 'i') ++vowel_count[2];
            if (thing.charAt(i) == 'o') ++vowel_count[3];
            if (thing.charAt(i) == 'u') ++vowel_count[4];
        }
        return vowel_count;
    }

    public static void wordLengths(Scanner in) {
        int[] answers = new int[81];
        while (in.hasNext()) {
            String token = in.next();
            int count = token.length();
            if (count > 0 && count <= 80) {
                ++answers[count];
            }
        }
        for (int i = 1; i <= answers.length; ++i) {
            System.out.print(i + ":\t " + answers[i] + "\t");
            for (int j = 0; j < answers[i]; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        int[] array1 = {6, 2, 9, 11, 3, 3, 3};
        int[] array0 = {};
        System.out.println(lastIndexOf(array, 3));
        System.out.println(range(array));
        System.out.println(longestSortedSequence(array0));
        System.out.println(percentEven(array1));
        System.out.println(isUnique(array0));
        System.out.println(priceIsRight(array1, 20));
        int[] array3 = append(array, array1);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        Scanner in = new Scanner(new File("output.txt"));
        wordLengths(in);
    }
}
