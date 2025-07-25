package Bubble_Sort;

import java.util.Scanner;

public class SortArray {

    public static void Bubble_Sort(int[] a) {
        int n = a.length;

        // n-1 iteration:-
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    // swap them:-
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element in the array:-");

        // Fill the array before sorting
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println();

        // Now sort the array:-
        Bubble_Sort(a);
        System.out.print("the sorted array is:-");

        for (int i : a) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
