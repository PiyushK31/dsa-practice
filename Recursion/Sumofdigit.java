package Recursion;

public class Sumofdigit {

    public static int sod(int n) {
        // base case:-
        if (n >= 0 && n <= 9) {
            return n;
        }

        // rec work:-small ans:-
        // int smallAns = sod(n / 10);

        // // self work:-
        return sod(n / 10) + n % 10;
    }

    public static void main(String args[]) {
        System.out.println(sod(1234));
    }
}