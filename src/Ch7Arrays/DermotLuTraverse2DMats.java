/**
 * @author: Dermot Lu
 * @since: 1.0
 * <p>
 * V1: this program allows us to practice row-wise traversal (left-right, right-left, zig-zag left to right, zigzag right to left) of a 2D matrix. The data from out 2 matrix is collapsed into a 1D array
 */
package Ch7Arrays;

public class DermotLuTraverse2DMats {
    public static int[] collapseLeftToRight(int[][] array) {
        int[] answer = new int[array.length * array[0].length]; //assumption: the array is not jagged
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                answer[i * array[0].length + j] = array[i][j];
            }
        }
        return answer;
    }

    public static int[] collapseRightToLeft(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = array[0].length - 1; j >= 0; --j) {
                answer[i * array[0].length + (array[0].length - j - 1)] = array[i][j];
            }
        }
        return answer;
    }

    public static int[] collapseZigZagLeftToRight(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                answer[i * array[0].length + j] = (i % 2 == 0) ? array[i][j] : array[i][array[0].length - j - 1];
            }
        }
        return answer;
    }

    public static int[] collapseZigZagRightToLeft(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[0].length; ++j) {
                answer[i * array[0].length + j] = (i % 2 == 1) ? array[i][j] : array[i][array[0].length - j - 1];
            }
        }
        return answer;
    }

    static void main() {
        int[][] array = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}};

        //task1: create a method called collapseLeftToRight that accepts a 2D array and returns a collapsed 1D array
        int[] leftToRight = collapseLeftToRight(array);
        for (int i = 0; i < leftToRight.length; ++i) {
            System.out.print(leftToRight[i] + " ");
        }

        System.out.println();

        //task 2: create a method called collapseRightToLeft that accepts a 2D array and returns a collapsed 1D array
        int[] rightToLeft = collapseRightToLeft(array);
        for (int i = 0; i < rightToLeft.length; ++i) {
            System.out.print(rightToLeft[i] + " ");
        }

        System.out.println();

        //zig-zag left to right:
        int[] zigZagLeftToRight = collapseZigZagLeftToRight(array);
        for (int i = 0; i < zigZagLeftToRight.length; ++i) {
            System.out.print(zigZagLeftToRight[i] + " ");
        }

        System.out.println();

        //zig-zag right to left:
        int[] zigZagRightToLeft = collapseZigZagRightToLeft(array);
        for (int i = 0; i < zigZagRightToLeft.length; ++i) {
            System.out.print(zigZagRightToLeft[i] + " ");
        }

        System.out.println();
    }

}
