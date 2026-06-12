/**
 * @author: Dermot Lu
 * @since: 1.0
 * <p>
 * V1: This program calculates n! using iteration and recursion
 */

package Ch12Recursion;

public class Factorial {
    public static int iterativeFactorial(int number) {
        int answer = 1;
        for (int i = 2; i <= number; ++i) {
            answer *= i;
        }

        return answer;
    }

    public static int recursiveFactorial(int number) {
        if (number == 0) {
            return 1;
        }
        return recursiveFactorial(number - 1) * number;
    }

    static void main() {
        System.out.println(recursiveFactorial(1));
    }
}
