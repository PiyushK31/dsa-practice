package Recursion;

public class Kmultiples {

    static void Kmultiples(int n, int k) {

        // base case:-
        if (k == 1) {
            System.out.println(n);
            return;
        }

        // rec case:-
        Kmultiples(n, k - 1);

        // self work:-
        System.out.println(n * k);
    }

    public static void main(String args[]) {
        Kmultiples(5, 4);
    }
}