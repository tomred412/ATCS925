package Ch7Arrays;

public class DermotLuAssignment54 {
    public static boolean isMagicSquare(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            if (array.length != array[i].length) return false;
            sum += array[i][0];
        }
        for (int i = 0; i < array.length; ++i) {
            int row_sum = 0;
            int column_sum = 0;
            for (int j = 0; j < array[0].length; ++j) {
                row_sum += array[i][j];
                column_sum += array[j][i];
            }
            if (row_sum != sum || column_sum != sum) return false;
        }

        int diagonal_1 = 0;
        int diagonal_2 = 0;
        for (int i = 0; i < array.length; ++i) {
            diagonal_1 += array[i][i];
            diagonal_2 += array[i][array.length - 1 - i];
        }

        return (diagonal_1 == sum && diagonal_2 == sum);
    }

    static void main() {
        int[][] square_matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println(isMagicSquare(square_matrix));

    }
}
