package Ch13SearchingAndSorting;

public class BinarySearch {
    public static int binarySearchIterative(int[] sorted_array, int find) {
        int low = 0;
        int high = sorted_array.length - 1;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (sorted_array[mid] == find) {
                return mid;
            } else if (sorted_array[mid] > find) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] data, int low, int high, int find) {
        int mid = low + (high - low) / 2;

        if (low > high) return -1;

        if (data[mid] == find) return mid;

        if (data[mid] > find) return binarySearchRecursive(data, low, mid - 1, find);
        else return binarySearchRecursive(data, mid + 1, high, find);

    }

    static void main() {
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.print(binarySearchRecursive(array, 0, array.length - 1, 11));
    }
}
