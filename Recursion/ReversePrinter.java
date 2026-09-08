// Write a Java program to print all numbers from n to 1 using recursion.
package Recursion;

public class ReversePrinter {

    public static void ReversePrinter(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        ReversePrinter(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;
        ReversePrinter(n);
    }
}
