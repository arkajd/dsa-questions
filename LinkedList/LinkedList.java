package LinkedList;

import java.util.HashSet;

public class LinkedList {
    Node head;

    public LinkedList(Node head){
        this.head = head;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // print values of linked list in reverse
    public void printReverse(Node node){
        if(node==null){
            return;
        }
        printReverse(node.next);
        System.out.println(node.data);

    }

    public void insertAtStart(Node node){
        if(head==null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    // add elements at the last position
    public void append(Node node){
        if(head==null){
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    // reverse linked list
    public void reverse(){

        if(head==null || head.next==null){
            return;
        }

        Node left = null;
        Node mid = head;
        Node right = head.next;

        while(right.next!=null){
            mid.next = left;
            left = mid;
            mid = right;
            right = right.next;
            mid.next = left;
        }
        right.next = mid;
        head = right;
    }

    // detect loop in a linked list
    public void detectLoop(Node head){
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while(temp!=null){
            if(set.contains(temp)){
                System.out.println(temp.data);
                return;
            }
            set.add(temp);
            temp = temp.next;
        }
    }

    // remove loop in a linked list
    public void removeLoop(Node head){
        HashSet<Node> set = new HashSet<>();
        Node temp = head;

        while(temp!=null){
            if(set.contains(temp.next)){
                temp.next = null;
                return;
            }
            set.add(temp);
            temp = temp.next;
        }
    }
}
