package Recursion;

public class NaturalNo {
    public static void NaturalNo(int n) {
        if (n == 0) {
            return;
        }
        NaturalNo(n - 1);
        System.out.println(n);
    }

    public static void main(String arhd[]) {
        int n = 10;
        NaturalNo(n);
    }
}
