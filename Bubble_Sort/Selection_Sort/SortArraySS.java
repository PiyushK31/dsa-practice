package Bubble_Sort.Selection_Sort;

import java.util.Scanner;

public class SortArraySS {

    public static void Selection_Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // represent the curent index!

            // find the min element in unsorted part of array!
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // swap the current element with min index
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String arhs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of an array:-");

        // fill the array before sorting->
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // caling the element:-
        Selection_Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Sorted array:" + arr[i] + " ");
        }

    }
}
