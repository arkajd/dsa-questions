package LinkedList;

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
}
