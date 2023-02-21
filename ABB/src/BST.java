public class BST {

    private Node root;

    public void addNode(int value) {
        if (root == null) { // arbol vacio
            root = new Node(value);
        } else {
            Node newNode = new Node(value);
            addNode(root, newNode);
        }
    }

    private void addNode(Node pointer, Node newNode) {
        if (newNode.getValue() < pointer.getValue()) { // ir hacia el subarbol izquierdo
            if (pointer.getLeft() == null) {
                pointer.setLeft(newNode);
            } else {
                addNode(pointer.getLeft(), newNode); // nueva recursion hacia el nivel inferior del left
            }
        } else { // ir hacia el subarbol derecho
            if (pointer.getRight() == null) {
                pointer.setRight(newNode);
            } else {
                addNode(pointer.getRight(), newNode); // nueva recursion hacia el nivel inferior del right
            }
        }


    }

    public void print(){
        print(root);
    }

    private void print(Node pointer){
        if(pointer !=null){
            print(pointer.getLeft());
            System.out.println(pointer.getValue()+" ");
            print(pointer.getRight());
        }
    }


}
