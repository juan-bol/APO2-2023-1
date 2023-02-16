public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addNodeAtHead(new Node(2));
        list.addNodeAtTail(new Node(3));
        list.addNodeAtTail(new Node(4));
        list.addNodeAtHead(new Node(1));
        list.deleteNodeAtHead();
        list.deleteNodeAtTail();

        list.print();
    }
}