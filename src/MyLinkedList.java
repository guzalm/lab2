public class MyLinkedList<E> {
    private class Node {
        E element;
        Node next;
        Node previous;

        public Node(E element, Node prev, Node next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
    }
}

