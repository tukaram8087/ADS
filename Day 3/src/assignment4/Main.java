package assignment4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Basic recursive quotient:");
        System.out.println("10 / 2 = " + Quotient.quotient(10, 2));
        System.out.println("10 / 3 = " + Quotient.quotient(10, 3));
        System.out.println("3 / 5 = " + Quotient.quotient(3, 5));

        System.out.println("\nSigned quotient:");
        System.out.println("10 / 2 = " + Quotient.quotientSigned(10, 2));
        System.out.println("-10 / 2 = " + Quotient.quotientSigned(-10, 2));
        System.out.println("10 / -2 = " + Quotient.quotientSigned(10, -2));
        System.out.println("-10 / -2 = " + Quotient.quotientSigned(-10, -2));
        System.out.println("10 / 3 = " + Quotient.quotientSigned(10, 3));
    }
}
