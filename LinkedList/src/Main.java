public class Main {

    static private SimpleLinkedList simpleLinkedList;

    public static void main(String[] args) {

        simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.getList(simpleLinkedList.getRoot());

        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 10);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 20);
        simpleLinkedList.addNodeAfterTarget(simpleLinkedList.getRoot(), 15, 10);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 50);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 100);


        simpleLinkedList.getList(simpleLinkedList.getRoot());
    }
}