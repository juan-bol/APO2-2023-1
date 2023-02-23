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



    public void inOrden(){
        inOrden(root);
        System.out.println();
    }

    private void inOrden(Node pointer){
        if(pointer !=null) {
            inOrden(pointer.getLeft());
            System.out.print(pointer.getValue() + " ");
            inOrden(pointer.getRight());
        }
    }

    public void preOrden(){
        preOrden(root);
        System.out.println();
    }

    private void preOrden(Node pointer){
        if(pointer !=null) {
            System.out.print(pointer.getValue() + " ");
            preOrden(pointer.getLeft());
            preOrden(pointer.getRight());
        }
    }

    public void postOrden(){
        postOrden(root);
        System.out.println();
    }

    private void postOrden(Node pointer){
        if(pointer !=null){
            postOrden(pointer.getLeft());
            postOrden(pointer.getRight());
            System.out.print(pointer.getValue()+" ");
        }
    }



}
