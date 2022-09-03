package LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new Node(1));

        ll.append(new Node(2));
        ll.append(new Node(3));
        ll.insertAtStart(new Node(4));

        ll.printReverse(ll.head);
    }
    
}
