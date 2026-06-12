package Ch12Recursion;

import java.util.Scanner;

public class PrintStarsRecursively {
    public static void printStars(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }

        System.out.print("*");
        printStars(n - 1);
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your desired stars: ");

        int n = in.nextInt();
        printStars(n);

        in.close();
    }
}
