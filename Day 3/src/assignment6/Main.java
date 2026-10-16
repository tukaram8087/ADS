package assignment6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursive multiplication:");
        System.out.println("12 * 5 = " + Multiplication.multiply(12, 5));
        System.out.println("7 * 8 = " + Multiplication.multiply(7, 8));
        System.out.println("-6 * 4 = " + Multiplication.multiply(-6, 4));
        System.out.println("6 * -4 = " + Multiplication.multiply(6, -4));
        System.out.println("-6 * -4 = " + Multiplication.multiply(-6, -4));
        System.out.println("100 * 0 = " + Multiplication.multiply(100, 0));
    }
}
