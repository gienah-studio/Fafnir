package Coding.Training;

public class LinkedList2 implements List{
    private DLNode header;
    private DLNode trailer;
    private int size;

    public LinkedList2() {
        this.header = new DLNode();
        this.trailer = new DLNode();
        header.setNext(trailer);
        trailer.setPrev(header);
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0) ? true: false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insertFirst(Object item) {
        DLNode n = header.getNext(); // Find the node behind header
        DLNode newFirst = new DLNode(item, header, n);
        header.setNext(newFirst);
        n.setPrev(newFirst);
        size++;
    }

    @Override
    public void insertLast(Object item) {
        DLNode p = trailer.getPrev(); // Find the node before trailer
        DLNode newLast = new DLNode(item, p, trailer);
        p.setNext(newLast);
        trailer.setPrev(newLast);
        size++;
    }

    @Override
    public Object getFirst() throws ExceptionQueueEmpty {
        if (isEmpty()) throw new ExceptionQueueEmpty("The DLNode array is empty.");
        DLNode first = header.getNext();
        return first.getElement();
    }

    @Override
    public Object getLast() throws ExceptionQueueEmpty {
        if (isEmpty()) throw new ExceptionQueueEmpty("The DLNode array is empty.");
        DLNode last = trailer.getPrev();
        return last.getElement();
    }

    @Override
    public Object removeFirst() throws ExceptionQueueEmpty {
        if (isEmpty()) throw new ExceptionQueueEmpty("The DLNode array is empty.");
        DLNode oldFirst = header.getNext();
        Object e = oldFirst.getElement();
        oldFirst.getNext().setPrev(header); // Update new first node prev to header
        header.setNext(oldFirst.getNext()); // Update header next node to new first node
        size--;
        return e;
    }

    @Override
    public Object removeLast() throws ExceptionQueueEmpty {
        if (isEmpty()) throw new ExceptionQueueEmpty("The DLNode array is empty.");
        DLNode oldLast = trailer.getPrev();
        Object e = oldLast.getElement();
        oldLast.getPrev().setNext(trailer); // Update new last node next to trailer
        trailer.setPrev(oldLast.getPrev()); // Update trailer prev node to new last node
        size--;
        return e;
    }
}
