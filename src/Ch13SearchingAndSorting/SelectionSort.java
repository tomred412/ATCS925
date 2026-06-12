package Ch13SearchingAndSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = temp;
        }
    }

    static void main() {
        int a[] = {1, 5, 3, 7, 2, 9, 8, 4, 6, 10};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
