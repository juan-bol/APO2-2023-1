public class DoubleLinkedList {

    private Node head;

    private Node tail;

    public void addNodeAtHead(Node node){
        if(head==null){ // lista vacia
            tail=node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head=node;
    }

    public void addNodeAtTail(Node node){
        if(head==null){ // lista vacia
            head=node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
    }

    public void deleteNodeAtHead(){
        if(head!=null){
            head=head.getNext();
            head.setPrevious(null);
        }
    }

    public void deleteNodeAtTail(){
        if(tail!=null){
            tail=tail.getPrevious();
            tail.setNext(null);
        }
    }

    public Node findNode(Node pointer, int value){
        if(pointer!=null && pointer.getValue()!=value){ // hace la recursion cuando no encunetra al nodo
            findNode(pointer.getNext(),value);
        }
        return pointer; // null cuando no lo encuentra
    }

    public void print(){
        print(head);
    }

    private void print(Node pointer){
        if(pointer!=null){
            System.out.println(pointer);
            print(pointer.getNext());
        }
    }
}
