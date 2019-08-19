package Coding.Training;

import Coding.Training.Exceptions.ExceptionStackEmpty;
import Coding.Training.Exceptions.ExceptionStackFull;

public class Stack_Array implements Stack {
    public static final int CAPACITY = 1024;
    protected int capacity;
    protected Object[] S;
    protected int pointer = -1;

    public Stack_Array() {
        this(CAPACITY);
    }

    public Stack_Array(int cap) {
        capacity = cap;
        S = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return pointer == -1 ? true: false;
    }

    @Override
    public int getSize() {
        int size = pointer + 1;
        return size;
    }

    @Override
    public void push(Object item) throws ExceptionStackFull {
        if (getSize() == capacity) throw new ExceptionStackFull("Stack overflow");
        S[++pointer] = item;
    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        Object top;

        if (isEmpty()) throw new ExceptionStackEmpty("The stack array is empty");
        top = S[pointer];
        S[pointer--] = null;
        return top;
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        if (isEmpty()) throw new ExceptionStackEmpty("The stack array is empty");
        return S[pointer];
    }

}
