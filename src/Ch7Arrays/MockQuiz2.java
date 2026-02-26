package Ch7Arrays;

public class MockQuiz2 {
    public static double averageLength(String[] array) {
        double average = 0.0;
        for (int i = 0; i < array.length; ++i) {
            average += array[i].length();
        }
        return average / array.length;
    }

    public static long range(int[] array) {
        long max = array[0];
        long min = array[0];
        for (var it : array) {
            if (max < it) max = it;
            if (min > it) min = it;
        }
        long range = max - min + 1;
        return range;
    }

    public static void main(String[] args) {
        String[] array = {"belt", "hat", "jelly", "bubble gum"};
        int[] a3 = {3, 10000000, 5, -29, 4};
        System.out.println(averageLength(array) + " " + range(a3));
    }
}
