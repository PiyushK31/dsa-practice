package Recursion;
import java . util .Scanner;

public class AlternativeSum {
    
    public static int alternativeSum(int n){
        //base case:-
        if (n == 0)   return 0;
        if(n%2==0){
            return alternativeSum(n-1) - n;
        }
        else {
            return alternativeSum(n-1) + n;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println(alternativeSum(n));
    }
}
