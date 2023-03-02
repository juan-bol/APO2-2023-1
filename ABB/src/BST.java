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

    private Node getMin(Node pointer){
        if(pointer.getLeft()==null){
            return pointer;
        } else {
            return getMin(pointer.getLeft());
        }
    }

    private Node getSucesor(Node pointer) {
        return getMin(pointer.getRight());
    }

    public void deleteNode(int value){
        deleteNode(null, root, value);
    }

    private void deleteNode(Node parent, Node pointer, int value){

        if(pointer==null){ // no lo encontramos
            return;
        }
        // para debuguear
//        if(parent!=null) System.out.println("parent:"+parent.getValue()+" pointer:"+pointer.getValue()+" value:"+value);
//        else  System.out.println("parent:null pointer:"+pointer.getValue()+" value:"+value);

        if (pointer.getValue() == value) { // encontramos el nodo
            System.out.println("lo encontro");
            // 1. es hoja
            if (pointer.getLeft()==null && pointer.getRight()==null){
                System.out.println("entro caso 1");
                if(parent.getLeft()==pointer){
                    parent.setLeft(null);
                } else {
                    parent.setRight(null);
                }
            }
            // 2. tiene solo hijo izquierdo
            else if(pointer.getRight()==null){
                System.out.println("entro caso 2");
                parent.setRight(pointer.getLeft());
                pointer.setLeft(null);
            }
            // 3. tiene solo un hijo derecho
            else if (pointer.getLeft()==null) {
                System.out.println("entro caso 3");
                parent.setLeft(pointer.getRight());
                pointer.setRight(null);
            }
            // 4. tiene dos hijos
            else {
                System.out.println("entro caso 4");
                Node sucesor = getSucesor(pointer); // el siguiente del puntero
                pointer.setValue(sucesor.getValue()); // transferencia del contenido, no de referencias
                deleteNode(pointer, pointer.getRight(),sucesor.getValue()); // eliminacion del sucesdor desde el subarbol derecho
            }
        } else if (pointer.getValue() > value) { // buscamos a la izquierda
            deleteNode(pointer, pointer.getLeft(), value);
        } else { // buscamos a la derecha
            deleteNode(pointer, pointer.getRight(), value);
        }
    }

    public Node findNode(int value) {
        return findNode(root, value);
    }

    private Node findNode(Node pointer, int value){
        if(pointer==null){ // el nodo no es encontro
            return null;
        } else if (pointer.getValue()==value) { // encontramos el nodo
            return pointer;
        } else if (pointer.getValue() > value) { // debemos buscar a la izquierda
            return findNode(pointer.getLeft(), value);
        } else { // debemos buscar a la derecha
            return findNode(pointer.getRight(), value);
        }
    }

}
