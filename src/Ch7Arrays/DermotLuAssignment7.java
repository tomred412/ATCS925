package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DermotLuAssignment7 {
    //1.
    public static int lastIndexOf(int[] array, int value) {
        for (int i = array.length - 1; i >= 0; --i) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    //2.
    public static int range(int[] array) {
        int min = array[0];
        int max = array[0];
        for (var it : array) {
            if (it > max) max = it;
            if (it < min) min = it;
        }
        return max - min + 1;
    }

    //3.
    public static int countInRange(int[] array, int min, int max) {
        int count = 0;
        for (var it : array) {
            if (it <= max && it >= min) ++count;
        }
        return count;
    }

    //4.
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i + 1] < array[i]) return false;
        }
        return true;
    }

    //5.
    public static int mode(int[] array) {
        Arrays.sort(array);
        int mode = array[0];
        int max = 0;
        int current = 0;
        for (int i = 0; i < array.length; ++i) {
            if (i == 0 || array[i] != array[i - 1]) {
                current = 1;
            } else {
                ++current;
            }
            if (current > max) {
                max = current;
                mode = array[i];

            }
        }
        return mode;
    }

    //6.
    public static double stdev(int[] array) {
        double mean = 0.0;
        for (int i = 0; i < array.length; ++i) {
            mean += array[i];
        }
        mean /= array.length;
        double standard_deviation = 0.0;
        for (int i = 0; i < array.length; ++i) {
            double temp = array[i] - mean;
            temp *= temp;
            standard_deviation += temp;
        }
        standard_deviation = Math.sqrt(standard_deviation);
        standard_deviation /= (array.length - 1);
        return standard_deviation;
    }

    //7.
    public static int kthLargest(int k, int[] a) {
        Arrays.sort(a);
        return a[a.length - 1 - k];
    }

    //8.
    public static int median(int[] array) {
        Arrays.sort(array);
        return array[(array.length - 1) / 2];
    }

    //9.
    public static int minGap(int[] array) {
        int min = Integer.MAX_VALUE;
        int gap = 0;
        if (array.length < 2) return gap;
        for (int i = 1; i < array.length; ++i) {
            gap = array[i] - array[i - 1];
            if (gap < min) min = gap;
        }
        return min;
    }

    //10.
    public static double percentEven(int[] array) {
        double even_count = 0.0;
        for (var it : array) {
            if (it % 2 == 0) ++even_count;
        }
        return Math.round(1000.0 * (even_count / array.length)) / 10.0;
    }

    //11.
    public static boolean isUnique(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] == array[j]) return false;
            }
        }
        return true;
    }

    //12.
    public static int priceIsRight(int[] bids, int guess) {
        int answer = -1;
        for (var it : bids) {
            if (it <= guess && it >= answer) answer = it;
        }
        return answer;
    }

    //13.
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

    //14.
    public static boolean contains(int[] a1, int[] a2) {
        for (var it2 : a2) {
            boolean found = false;
            for (var it1 : a1) {
                if (it2 == it1) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    //15.
    public static int[] collapse(int[] a) {
        int[] answer = new int[(a.length + 1) / 2];
        for (int i = 1; i < a.length; i += 2) {
            answer[(i - 1) / 2] = a[i] + a[i - 1];
        }
        return answer;
    }

    //16.
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

    //17.
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

    //18.
    public static void evenBeforeOdd(int[] a) {
        int even = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] % 2 == 0) {
                int temp = a[i];
                a[i] = a[even];
                a[even] = temp;
                ++even;
            }
        }
    }

    //19.
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

}
