package Recursion;
public class Gcd {

    // public static int LongDivisiorApp(int x , int y){
    //     while (x%y != 0) {
    //         int rem =  x%y;
    //         x=y;
    //         y = rem;
    //     }
    //     return y;
    // }
    // public static void main(String arhs[]){
    //     System.out.println(LongDivisiorApp(12, 16));
    // }

    public static int EuclidAlgo(int x , int y){
        //base case:-
        if (y==0) {
            return x;
        }
        return EuclidAlgo(y, x%y);
    }
    public static void main(String arhs[]){
        System.out.println(EuclidAlgo(24, 15));
    }
}