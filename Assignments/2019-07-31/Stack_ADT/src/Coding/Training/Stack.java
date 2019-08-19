package Coding.Training;

import Coding.Training.Exceptions.ExceptionStackEmpty;
import Coding.Training.Exceptions.ExceptionStackFull;

public interface Stack {
    /*
    *
    * push(Object item): add item to the top of the stack
    * pop(): extract the top item of the stack, return the item. If stack is empty, throw an exception. (The item is removed from the stack)
    * getSize(): return the size of the stack.
    * isEmpty(): return true if the stack is empty, otherwise return false.
    * top(): return the top item of the stack. (The item is not removed from the stack)
    *
   */
    public void push(Object item) throws ExceptionStackFull;
    public Object pop() throws ExceptionStackEmpty;
    public int getSize();
    public boolean isEmpty();
    public Object top();

}
