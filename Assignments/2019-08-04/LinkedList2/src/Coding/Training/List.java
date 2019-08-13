package Coding.Training;

public interface List {
    /*
    *
    * insertFirst/Last(Object item): insert item as the first/last element.
    * removeFirst/Last(): extract the first/last element, pop them out of the list, return item.
    * getFirst/Last(): return the first/last element.
    * getSize(): return the length of the list.
    * isEmpty(): return true if the list is empty.
    *
    * */

    public void insertFirst(Object item);
    public void insertLast(Object item);
    public Object removeFirst() throws ExceptionQueueEmpty;
    public Object removeLast() throws ExceptionQueueEmpty;
    public Object getFirst() throws ExceptionQueueEmpty;
    public Object getLast() throws ExceptionQueueEmpty;
    public int getSize();
    public boolean isEmpty();
}
