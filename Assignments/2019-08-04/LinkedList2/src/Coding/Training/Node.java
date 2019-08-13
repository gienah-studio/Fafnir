package Coding.Training;

public class Node implements Position {
    private Object elem;
    private Node next;

    public Node() {
        this.elem = null;
        this.next = null;
    }

    public Node(Object e, Node n) {
        elem = e;
        next = n;
    }

    @Override
    public Object getElement() {
        return elem;
    }

    @Override
    public Object setElement(Object e) {
        Object oldElem = elem;
        elem = e;
        return oldElem;
    }
}
