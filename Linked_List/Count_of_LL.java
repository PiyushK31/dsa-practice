package Linked_List;

public class Count_of_LL {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.print("Total numbers of elements in Linked List is: " + count);
    }    
}
