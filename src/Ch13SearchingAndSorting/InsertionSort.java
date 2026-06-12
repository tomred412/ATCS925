package Ch13SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            int insert_index = i;
            int current = a[i];

            for (int j = i - 1; j >= 0; --j) {
                if (a[j] > current) {
                    a[j + 1] = a[j];
                    insert_index = j;
                } else {
                    break;
                }
                a[insert_index] = current;
            }
        }
    }

    static void main() {
        int[] array = {1, 0, 4, 3, 9, 6, 8, 2, 7, 5, 10};
        System.out.println(Arrays.toString(array));
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
