package Recursion;

public class Countpfdigit {

    public static int cod(int n) {
        // base case:-
        if (n >= 0 && n <= 9)
            return 1;
        return 1 + cod(n / 10);
    }

    public static void main(String args[]) {
        System.out.println(cod(1234));
    }
}
