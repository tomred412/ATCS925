package Ch12Recursion;

public class DermotLuPow {
    public static int iterativePow(int base, int exponent) {
        int answer = 1;
        for (int i = 0; i < exponent; ++i) {
            answer *= base;
        }
        return answer;
    }

    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * recursivePow(base, exponent - 1);
    }

    static void main() {
        System.out.println(iterativePow(3, 4));
        System.out.println(recursivePow(3, 4));
    }
}
