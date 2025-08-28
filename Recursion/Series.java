package Recursion;
import java.util.Scanner;

public class Series {

    public static int SeriesSum(int n){
        if(n == 0){
            return 0;   // base case should return 0
        }
        return SeriesSum(n - 1) + n;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = SeriesSum(n);
        System.out.println("Sum of series up to " + n + " is: " + result);

        sc.close();
    }
}
