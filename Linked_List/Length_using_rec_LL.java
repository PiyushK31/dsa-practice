package Linked_List;

public class Length_using_rec_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static int Length_using_rec(Node head){
        if(head == null) return 0;
        return 1 + Length_using_rec(head.next);
    }
    public static void main(String args[]){
        Node a = new Node(9);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(Length_using_rec(a));
    }
}
