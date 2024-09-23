import java.util.*;

public class LinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add a new node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
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
        size++;
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
    public void addInMiddleLL(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        if(head==null){
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

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
    public int removeFirst(){
        if(size==0){//we will check if any node exists or not we can check by using size 
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){//we will check if any node exists or not we can check by using size ==1 then itself head and tail to that node
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int helperFn(Node head,int key){//O(N)
        if(head==null){
            return -1;
        }
        if(head.data==key)return 0;
        int idx=helperFn(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recursiveSearchApproach(int key){
        return helperFn(head,key);
    }

    public int iterativeApproach(int key){//TC=>O(N)
        if(size==0){
            System.out.println("LL is empty");
        }
        int idx=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){//key found
                return idx;
            }else{
                temp=temp.next;
                idx++;
            }
        }
        //key not found
        return -1;
    }
    public int lastRemove(){
        //we have to perform this operation so 
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev=>size-2 last node se phle wala prev
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;//prev.next means tail ka data
        }
        int cal=prev.next.data;//tail data
        prev.next=null;
        tail=prev;
        size--;
        return cal;
    }
    public void deletenthnode(int n){
        //calculate size of ll
        int size=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            size++;
        }

        if(n==size){
            head=head.next;//remove first
            return; 
        }

        //size-n=prev
        int i=1;
        int itoFind=size-n;
        Node prev=head;
        while (i<itoFind) {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }
    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //update node 
        head=prev;

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addInMiddleLL(2, 5);
        System.out.println(ll);
        ll.reverseLL();
        System.out.println(ll);
        // System.out.println(reverseLL());
        // System.out.println(ll.reverseLL());
        System.out.println("fdskfsdkj"+ll.iterativeApproach(5));
        System.out.println("ffffffffffff"+ll.recursiveSearchApproach(5));
        System.out.println(ll.size);
        int removedValue = ll.removeFirst();
        System.out.println("Removed: " + removedValue);
        System.out.println(ll.size);
    }
}
