package Ch7Arrays;

public class IntroTo2DArrays {
    public static void populateStars(String[][] array) {
        for (int n = 0; n < array.length; ++n) {
            for (int m = 0; m < array[n].length; ++m) {
                array[n][m] = "*";
            }
        }
    }

    public static void printArray(String[][] array) {
        for (int n = 0; n < array.length; ++n) {
            for (int m = 0; m < array[n].length; ++m) {
                System.out.print(array[n][m]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String array[][] = new String[4][5];
        populateStars(array);
        
        array[2][3] = "+";
        printArray(array);
    }
}
