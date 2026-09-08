package Recursion;

public class RevnatruralNo {

    public static void RevnatruralNo(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        RevnatruralNo(n - 1);
    }

    public static void main(String arhs[]) {
        int n = 10;
        RevnatruralNo(n);
    }
}
