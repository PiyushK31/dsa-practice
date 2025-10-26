package ArrayList;

import java.util.ArrayList;

public class RevArr {

    // Reverse the list
    public void reverseList(ArrayList<Integer> l1) {
        int i = 0, j = l1.size() - 1;
        while (i < j) {
            // swap
            Integer temp = l1.get(i);
            l1.set(i, l1.get(j));
            l1.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);

        // print before reversing
        System.out.println("ArrayList before reverse: " + l1);

        // create an object to call non-static method
        RevArr obj = new RevArr();
        obj.reverseList(l1);

        // print after reversing
        System.out.println("ArrayList after reverse: " + l1);
    }
}
