public class SimpleLinkedList {

    private Node root;

    public SimpleLinkedList() {
        this.root = null;
    }

    public void addNodeAtEnd(Node pointer, int value){
        Node node = new Node( value);
        if(root==null){ // caso base, lista vacía
            root=node;
        }
        else if(pointer.getNext()==null){ // caso base, se encontro el ultimo
            pointer.setNext(node);
        } else { // se sigue buscando el ultimo recursivamente
            addNodeAtEnd(pointer.getNext(), value);
        }
    }

    public void addNodeAfterTarget(Node pointer, int value, int targetValue) {
        if(pointer!=null) { // caso base, lista vacía o no se encontro el target
            if(pointer.getValue()==targetValue){ // se encontro el target
                Node node = new Node( value);
                node.setNext(pointer.getNext());
                pointer.setNext(node);
            } else { // se sigue buscando el target recursivamente
                addNodeAfterTarget(pointer.getNext(), value, targetValue);
            }
        }
    }

    public void getList(Node pointer){
        if(pointer!=null){
            System.out.println(pointer.getValue());
            getList(pointer.getNext());
        }

    }


    public Node getRoot() {
        return root;
    }

}
