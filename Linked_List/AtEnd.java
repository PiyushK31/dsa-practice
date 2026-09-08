package Linked_List;

import java.util.LinkedList;

public class AtEnd {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void incertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
            }
            else{
                tail.next = temp;
            } 
             tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " " );
                temp = temp.next;
            }
        }
        int length(){
            int count = 0 ;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;

        }
    }
    public static void main(String args[]){
        LinkedList l1 = new LinkedList();
        l1.incertAtEnd(4);
        l1.incertAtEnd(5);
        System.out.print("The LinedList is: ");
        l1.display();
        System.out.println();
        System.out.print("The size of LinkedList is:" + l1.length());
    }
}
