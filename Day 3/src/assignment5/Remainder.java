package assignment5;

public class Remainder {
    // Basic recursive remainder for non-negative inputs.
    public static int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                "Basic remainder requires non-negative numbers");
        }
        if (a < b) return a;
        return remainder(a - b, b);
    }

    // Wrapper matching Java remainder sign behavior.
    public static int remainderSigned(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);
        long result = remainderPositive(dividend, divisor);
        if (a < 0) result = -result;
        return (int) result;
    }

    private static long remainderPositive(long a, long b) {
        if (a < b) return a;
        return remainderPositive(a - b, b);
    }
}
