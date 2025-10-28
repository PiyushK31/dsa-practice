package Linked_List;

public class Display_fun {

    public static void Display_fun(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String arhs[]){
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Display_fun(a);
    }
}
