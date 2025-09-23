// import java.util.Scanner;
// public class Mutl_of_two_matrix {

//     public static void printArray(int[][]arr ){
//         for(int i=0 ; i<arr.length ; i++){
//             for(int j=0 ; j<arr[i].length ; j++){
//                 System.out.println(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void muty(int [][]a , int r1 , int c1 , int[][]b , int r2 , int c2){
//         if(r1 != r2 || c1 != c2){
//             System.out.println("Wrong input - Addition not possible");
//             return;
//         }
//         int[][] sum = new int[r1][c1];

//         for(int i=0 ; i<r1 ; i++) {
//             for(int j=0 ; j<c1 ; j++) {
//                 sum[i][j] += a[i][j] * b[i][j];
//             }
//         }

//         System.out.println("Sum of matrices:");
//         printArray(sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the rows and columns of the matrix 1:");
//         int r1 = sc.nextInt();
//         int c1 = sc.nextInt();
//         int [][]a = new int[r1][c1];
//         System.out.println("Enter matrix 1 values:");
        
//         for(int i=0 ; i<r1 ; i++){
//             for(int j=0 ; j<c1 ; j++){
//                 a[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter matrix 2 values:");
//         int r2 = sc.nextInt();
//         int c2 = sc.nextInt();
//         int [][]b = new int[r2][c2];
//         for(int i=0 ; i<r2 ; i++){
//             for(int j=0 ; j<c2 ; j++){
//                 b[i][j] = sc.nextInt();
//             }
//         }
//          // Printing matrices
//          System.out.println("Matrix 1:");
//          printArray(a);
 
//          System.out.println("Matrix 2:");
//          printArray(b);
 
//          // multipletion matrices
//          muty(a, r1, c1, b, r2, c2);
 
//          // Close scanner
//          sc.close();
//     }
// }

import java.util.Scanner;

public class Mutl_of_two_matrix {
    
    // Print 2D Array
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Matrix Multiplication
    public static void multiplyMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible (Columns of Matrix 1 must equal Rows of Matrix 2)");
            return;
        }

        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        printArray(product);
    }

    public static void main(String[] args) {                                                                                        
        Scanner sc = new Scanner(System.in);

        // Input for Matrix 1
        System.out.println("Enter the rows and columns of matrix 1:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("Enter elements of matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.println("Enter the rows and columns of matrix 2:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("Enter elements of matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Printing matrices
        System.out.println("Matrix 1:");
        printArray(a);

        System.out.println("Matrix 2:");
        printArray(b);

        // Perform matrix multiplication
        multiplyMatrices(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
