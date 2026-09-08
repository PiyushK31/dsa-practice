package OppsInJava.ProblemonSorting;

public class Lexicographical {

    public static void sortFruits(String []fruits){
        int n = fruits.length;
        
        for(int i=0 ; i<n ;i++){
            int min_index = i;
            for(int j=i+1 ; j<n ; j++){
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            //swap:-
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String args[]){
        String []fruits = {"kiwi" , "apple" , "papaya" , "mango"}; 
        sortFruits(fruits);
        System.out.println();
        for(String val : fruits){
            System.out.println(val + " ");
        }
    }
}