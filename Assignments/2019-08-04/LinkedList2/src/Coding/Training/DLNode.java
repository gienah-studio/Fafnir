package Coding.Training;

public class DLNode implements Position {
    private Object elem;
    private DLNode next;
    private DLNode prev;

    public DLNode() {
        this.elem = null;
        this.next = null;
        this.prev = null;
    }

    public DLNode(Object e, DLNode p, DLNode n) {
        elem = e;
        next = n;
        prev = p;
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

    public DLNode getNext() {
        return next;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setNext(DLNode newNext) {
        this.next = newNext;
    }

    public void setPrev(DLNode newPrev) {
        this.prev = newPrev;
    }
}
