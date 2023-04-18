public class MyLinkedList<E> {
    private class Node {
        E element;
        Node next;
        Node previous;
        public Node(E element, Node previous, Node next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }


}

