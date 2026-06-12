/**
 * @author: Dermot Lu
 * @since: 1.0
 * <p>
 * V1: This program is an introduction to recursion using piecewise functions. This program is intended to build recursive mindset.
 */
package Ch12Recursion;

public class IntroToRecursion {

    public static int f(int x) {
        //base case (to break out of the recursive loop) -> exit strategy
        if (x <= 4) {
            return x + 4;
        }

        //recursive cases (make the problem smaller)
        else if (x > 6) {
            return 2 * f(x - 3) - 3;
        } else {
            return f(x + 2) + 1;
        }
    }

    static void main() {
        System.out.println(f(12)); //answer should be 95
    }
}
