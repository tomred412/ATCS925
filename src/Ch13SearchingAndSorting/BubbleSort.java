package Ch13SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = 0; j < (a.length - i - 1); ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void main() {
        int a[] = {9, 0, 1, 3, 2, 6, 4, 5, 8, 10, 7};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
