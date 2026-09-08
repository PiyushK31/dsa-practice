package ArrayList;
import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
    //creating Wraper class:-
    // Integer i = Integer.valueOf(1);
    // System.out.println(i);
    // Float j = Float.valueOf(5.67f);
    // System.out.println(j);
    // Boolean k = Boolean.valueOf(true);
    // System.out.println(k);
    // String l = String.valueOf("Piyush21");
    // System.out.println(l);

    //creating an array list:-
    // ArrayList<Float> l2 = new ArrayList<>();
    ArrayList<Integer> l1 = new ArrayList<>();
    // ArrayList<Boolean> l3 = new ArrayList<>();
    // ArrayList<String> l4 = new ArrayList<>();

    //Adding elaments in ArrayList:-
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    // System.out.println(l1.get(0));
    // System.out.println(l1.get(1));
    // System.out.println(l1.get(2));
    // System.out.println(l1.get(3));

    //Printing by loop:-
    // for(int i=0 ; i<l1.size(); i++){
    //     System.out.println(l1.get(i));
    // }

    //Printing the Array Directly:-
    System.out.println(l1);

    //adding some element at some index i:-
    l1.add(1,100);
    // System.out.println(l1);

    //modifing element at index i:-
    l1.set(1,10);
    // System.out.println(l1);

    //remove element at indedx i:-
    l1.remove(1 );
    // System.out.println(l1);

    //remove an element:-
    l1.remove(Integer.valueOf(4));
    // System.out.println(l1);

    //check if element exist or not:-
    boolean ans = l1.contains(Integer.valueOf(10));
    // System.out.println(ans);

    //If you don't secected any class for arrayList then you can put anything in the class:-
    // ArrayList l = new ArrayList();
    // l.add("Piyush");
    // l.add(21);
    // l.add(true);
    // System.out.println(l);
    }
}

