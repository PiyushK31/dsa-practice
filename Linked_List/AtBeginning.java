package Linked_List;

public class AtBeginning {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // Insert at beginning
        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;  // both head and tail are same for first node
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Insert at end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Display linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(2);
        l1.display();            // Output: 2
        l1.insertAtEnd(5);
        l1.display();            // Output: 2 5
        l1.insertAtBeginning(6);
        l1.display();            // Output: 6 2 5
        l1.insertAtEnd(9);
        l1.display();   //output: 6 2 5 9
    }
}
