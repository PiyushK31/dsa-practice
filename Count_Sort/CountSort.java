package Count_Sort;

public class CountSort {

    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        return max; // return missing
    }

    static void display(int arr[]){
        System.out.println("Array elements are: ");
        for(int val: arr){
            System.out.print(val + " "); // print on same line
        }
        System.out.println();
    }

    public static void countSort(int arr[]){
        int n = arr.length;
        int []output = new int[n];
        int max = findMax(arr);
        int count[] = new int[max+1];

        // Step 1: Count frequency
        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        // Step 2: Prefix sum
        for(int i=1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }

        // Step 3: Build output array (reverse loop for stability)
        for(int i=n-1 ; i>=0 ; i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // Step 4: Copy back to original array
        for(int i=0; i<n ; i++){
            arr[i] = output[i];
        }
    }

    public static void main(String args[]){
        int arr[] = {1 , 4 , 5 , 2 , 2 , 5};
        countSort(arr);
        display(arr);
    }
}



