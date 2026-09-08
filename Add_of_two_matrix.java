// public class Add_of_two_matrix {
//     public static void main(String args[]){

//         int A [][] = {
//             {2 , 3},
//             {4 , 5}
//         };

//         int B [][] = {
//             {1 , 2},
//             {3 , 4}
//         };
//         System.out.println("The resutlt matrix is:");
//         int [][]sum = new int[2][2];
//         for(int i=0 ; i<2 ; i++){
//             for(int j=0 ; j<2 ; j++){
//                 sum[i][j] = A[i][j] + B[i][j];
//                 System.out.print(sum[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class Add_of_two_matrix {
    
    public static void printArray(int [][]arr) {
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int [][]a , int r1 , int c1 , int[][]b , int r2 , int c2) {
        if(r1 != r2 || c1 != c2) {
            System.out.println("Wrong input - Addition not possible");
            return;
        }

        int[][] sum = new int[r1][c1];

        for(int i=0 ; i<r1 ; i++) {
            for(int j=0 ; j<c1 ; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        printArray(sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Matrix 1
        System.out.println("Enter the rows and columns of the matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][]a = new int[r1][c1];
        System.out.println("Enter matrix 1 values:");
        for(int i=0 ; i<r1 ; i++) {
            for(int j=0 ; j<c1 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Matrix 2
        System.out.println("Enter the rows and columns of matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int [][]b = new int[r2][c2];
        System.out.println("Enter matrix 2 values:");
        for(int i=0 ; i<r2 ; i++) {
            for(int j=0 ; j<c2 ; j++) {  // Fixed j++ instead of i++
                b[i][j] = sc.nextInt();
            }
        }

        // Printing matrices
        System.out.println("Matrix 1:");
        printArray(a);

        System.out.println("Matrix 2:");
        printArray(b);

        // Adding matrices
        add(a, r1, c1, b, r2, c2);

        // Close scanner
        sc.close();
    }
}
