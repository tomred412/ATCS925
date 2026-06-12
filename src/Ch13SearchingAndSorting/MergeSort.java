package Ch13SearchingAndSorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] a, int[] left, int[] right) {
        int left_count = 0;
        int right_count = 0;
        int original_count = 0;

        while (left_count < left.length && right_count < right.length) {
            if (left[left_count] <= right[right_count]) {
                a[original_count] = left[left_count];
                ++left_count;
            } else {
                a[original_count] = right[right_count];
                ++right_count;
            }
            ++original_count;
        }

        while (left_count < left.length) {
            a[original_count] = left[left_count];
            ++left_count;
            ++original_count;
        }

        while (right_count < right.length) {
            a[original_count] = right[right_count];
            ++right_count;
            ++original_count;
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length >= 2) {
            int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            mergeSort(left);
            mergeSort(right);

            merge(a, left, right);
        }
    }

    static void main() {
        int[] data = {5, 1, 0, 2, 6, 3, 9, 7, 8, 4, 10};
        System.out.println(Arrays.toString(data));

        mergeSort(data);
        System.out.println(Arrays.toString(data));
    }
}
