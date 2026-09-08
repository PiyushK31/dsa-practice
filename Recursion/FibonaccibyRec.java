package Recursion;

public class FibonaccibyRec {

    public static int FibonaccibyRec(int n) {
        // base case:-
        if (n == 0 || n == 1) {
            return n;
        }

        // subproblem:-
        int pre = FibonaccibyRec(n - 1);
        int preofpre = FibonaccibyRec(n - 2);

        // self work:-
        return pre + preofpre;
    }

    // main class:-
    public static void main(String args[]) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(FibonaccibyRec(i));
        }
    }
}