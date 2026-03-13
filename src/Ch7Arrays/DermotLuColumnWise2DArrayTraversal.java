package Ch7Arrays;

public class DermotLuColumnWise2DArrayTraversal {
    public static int[] collapseTopToBottom(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int j = 0; j < array[0].length; ++j) {
            for (int i = 0; i < array.length; ++i) {
                answer[j * array.length + i] = array[i][j];
            }
        }
        return answer;
    }

    public static int[] collapseBottomToTop(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int j = 0; j < array[0].length; ++j) {
            for (int i = array.length - 1; i >= 0; --i) {
                answer[j * array.length + (array.length - i - 1)] = array[i][j];
            }
        }
        return answer;
    }

    public static int[] collapseZigZagTopToBottom(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int j = 0; j < array[0].length; ++j) {
            for (int i = 0; i < array.length; ++i) {
                answer[j * array.length + i] = (j % 2 == 0) ? array[i][j] : array[array.length - i - 1][j];
            }
        }
        return answer;
    }

    public static int[] collapseZigZagBottomToTop(int[][] array) {
        int[] answer = new int[array.length * array[0].length];
        for (int j = 0; j < array[0].length; ++j) {
            for (int i = 0; i < array.length; ++i) {
                answer[j * array.length + i] = (j % 2 == 1) ? array[i][j] : array[array.length - i - 1][j];
            }
        }
        return answer;
    }

    static void main() {
        int[][] array = {{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}};

        int[] collapseTopToBottom = collapseTopToBottom(array);
        for (int i = 0; i < collapseTopToBottom.length; ++i) {
            System.out.print(collapseTopToBottom[i] + " ");
        }

        System.out.println();

        int[] collapseBottomToTop = collapseBottomToTop(array);
        for (int i = 0; i < collapseBottomToTop.length; ++i) {
            System.out.print(collapseBottomToTop[i] + " ");
        }

        System.out.println();

        int[] collapseZigZagTopToBottom = collapseZigZagTopToBottom(array);
        for (int i = 0; i < collapseZigZagTopToBottom.length; ++i) {
            System.out.print(collapseZigZagTopToBottom[i] + " ");
        }

        System.out.println();

        int[] collapseZigZagBottomToTop = collapseZigZagBottomToTop(array);
        for (int i = 0; i < collapseZigZagBottomToTop.length; ++i) {
            System.out.print(collapseZigZagBottomToTop[i] + " ");
        }

        System.out.println();
    }

}
