package Linked_List;

public class BasicLL {

    public static class Node{
        int data; //value
        Node next; //address of next node!
        Node (int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(5);
        // System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b; // 5 -> 3 9 8 16
        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
        System.out.println(a); //Add:-Linked_List.BasicLL$Node@251a69d7
        System.out.println(b); //Add:-Linked_List.BasicLL$Node@7344699f
        System.out.println(c); //Add:-Linked_List.BasicLL$Node@6b95977
        System.out.println(d); //Add:-Linked_List.BasicLL$Node@7e9e5f8a
    }
}
