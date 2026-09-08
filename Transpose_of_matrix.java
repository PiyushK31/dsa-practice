import java.util.Scanner;
public class Transpose_of_matrix {

    public static void printArray(int [][]arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " "); // Print each element
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

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        //input for matrix 1:-
        System.out.println("Enter the number of row and column for matrix 1:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][]a = new int[r][c];
        int totalelement = r*c;
        System.out.println("Enter " +totalelement+ "values for matrix:");
        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        //printing the matrix:-
        System.out.println("matrix:");
        printArray(a);
        System.out.println("transpose of matrix");
        int [][]ans = transpose(a, r, c);
        printArray(ans);
    }
}