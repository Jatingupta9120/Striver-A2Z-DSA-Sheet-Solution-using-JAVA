import java.util.*;

class LinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Add a new node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void printData(int data){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+" ");   
            temp=temp.next;
        }
        System.out.println();
    }

    // // Override toString to display the linked list
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null"); // End of the list
        return result.toString();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
    }
}
