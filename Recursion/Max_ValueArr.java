package Recursion;

public class Max_ValueArr {

    public static int MaxElement(int arr[] , int idx){
        //base case:-
        if(idx ==arr.length){
            return Integer.MIN_VALUE;
        } 
        //recv case:-
        int maxInRest = MaxElement(arr, idx+1);
        return Math.max(arr[idx], maxInRest);
    }
    public static void main(String []args){
        int arr[] = {5 , 6, 7 , 8 , 9};
        System.out.println(MaxElement(arr, 0));
    }
}
