package Recursion;
public class LinearSearchRecursion {

    static boolean Search(int arr[] , int n , int target , int idx){
        //base case:
        if(idx >= n ) return false;
        //self work:-
        if(arr[idx] == target) return true;
        //rec work:-
        return Search(arr, n, target, idx+1);
    }
    public static void main(String argsp[]){
        int arr[] = {1 , 2 , 3 , 4 , 5};
        int target = 3;
        if(Search(arr, arr.length , target, 0)){
            System.out.println("yes!!");
        } else {
            System.out.println("No!!");
        }
    }
}