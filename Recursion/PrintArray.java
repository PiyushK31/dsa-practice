package Recursion;

public class PrintArray {

    public static void PrintArray(int[] arr, int idx) {
        // base case
        if (idx == arr.length) {
            return;
        }
        // self work
        System.out.println(arr[idx]);
        // recursive work
        PrintArray(arr, idx + 1);
    }
    
    public static void main(String arhs[]) {
        int[] arr = {5, 6, 7, 8, 9};
        PrintArray(arr, 0); // Only call, do not print return value
    }
}