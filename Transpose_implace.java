import java.util.Scanner;

public class Transpose_implace {

    public static void printArray(int [][]arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeImplace(int [][]a, int r, int c ){
        if(r != c) {
            System.out.println("In-place transpose is only possible for square matrices.");
            return a;
        }

        for(int i=0 ; i<r ; i++){
            for(int j=i+1 ; j<c ; j++){
                // Swap a[i][j] with a[j][i]
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a; // Return the same matrix after modification
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];  // Matrix declaration (Kept your original variable name 'a')
        int totalelement = r * c;

        System.out.println("Enter " + totalelement + " values for the matrix:");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix:");
        printArray(a);

        System.out.println("Transpose of matrix:");
        printArray(transposeImplace(a, r, c));  // Using your matrix 'a'

        sc.close();
    }
}
