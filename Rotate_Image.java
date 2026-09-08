import java.util.Scanner;

public class Rotate_Image{

    public static void printArray(int [][]arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int [][]a , int r , int c ){
        int [][]ans = new int[c][r];
        for(int i=0 ; i<c ; i++){
            for(int j=0 ; j<r ; j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;       
    }

    public static void rotateClockwise(int [][]a){
        int n = a.length;

        // Transpose in-place
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse each row to complete 90° clockwise rotation
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of rows and columns for matrix (Square matrix only):");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int totalelement = n * n;

        System.out.println("Enter " + totalelement + " values for matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printArray(a);

        rotateClockwise(a);

        System.out.println("Matrix after 90° Clockwise Rotation:");
        printArray(a);

        sc.close();
    }
}
