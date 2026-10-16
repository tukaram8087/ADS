package assignment6;

public class Multiplication {
    public static int multiply(int a, int b) {
        long result = multiplyRecursive((long) a, (long) b);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException(
                "Integer overflow: result is outside int range");
        }
        return (int) result;
    }

    private static long multiplyRecursive(long a, long b) {
        if (b == 0) return 0;
        if (b < 0) return -multiplyRecursive(a, -b);

        if (b % 2 == 0) {
            return multiplyRecursive(a + a, b / 2);
        }
        return a + multiplyRecursive(a, b - 1);
    }
}
