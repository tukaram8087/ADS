package assignment4;

public class Quotient {
    // Basic recursive quotient for non-negative inputs.
    public static int quotient(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                "Basic quotient requires non-negative numbers");
        }
        if (a < b) return 0;
        return 1 + quotient(a - b, b);
    }

    // Wrapper matching Java integer division for int inputs.
    public static int quotientSigned(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        long dividend = Math.abs((long) a);
        long divisor = Math.abs((long) b);
        long result = quotientPositive(dividend, divisor);
        if ((a < 0) != (b < 0)) result = -result;

        // Java int division overflows for MIN_VALUE / -1 and returns MIN_VALUE.
        if (result > Integer.MAX_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }

    private static long quotientPositive(long a, long b) {
        if (a < b) return 0;
        return 1 + quotientPositive(a - b, b);
    }
}
