package Recursion;

public class SumOfarray {

    static int ArrSum(int arr[] , int idx){

        //base case:-
        if(idx  == arr.length){
            return 0 ;
        }
        //recv case:-
        //sefl work:-
        
        return arr[idx] + ArrSum(arr, idx+1);
    }
    public static void main(String args[]){
        int arr[] = {5 , 6 , 7, 8 , 9};
        System.out.println(ArrSum(arr, 0));
    }
}
