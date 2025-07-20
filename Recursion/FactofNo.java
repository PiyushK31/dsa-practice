package Recursion;

public class FactofNo {

    // Recursive method to calculate factorial
    static int FactofNo(int n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive call and self work
        return n * FactofNo(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(FactofNo(n)); // Directly printing result
    }
}