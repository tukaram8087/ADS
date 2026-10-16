package assignment5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic recursive remainder:");
        System.out.println("10 % 3 = " + Remainder.remainder(10, 3));
        System.out.println("10 % 2 = " + Remainder.remainder(10, 2));
        System.out.println("3 % 5 = " + Remainder.remainder(3, 5));

        System.out.println("\nSigned remainder:");
        System.out.println("10 % 3 = " + Remainder.remainderSigned(10, 3));
        System.out.println("-10 % 3 = " + Remainder.remainderSigned(-10, 3));
        System.out.println("10 % -3 = " + Remainder.remainderSigned(10, -3));
        System.out.println("-10 % -3 = " + Remainder.remainderSigned(-10, -3));
    }
}
