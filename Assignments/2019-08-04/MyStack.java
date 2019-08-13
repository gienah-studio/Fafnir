package Coding.Training.LC2019_08_04;

public class MyStack {
    protected int CAPACITY = 1024;
    private int[] S;
    private int pointer = -1;

    /** Initialize your data structure here. */
    public MyStack() {
        S = new int[CAPACITY];
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int cap = pointer + 2;
        if (cap > CAPACITY) { // Expand the capacity
            cap = (pointer + 1) * 2;
            int[] temp = new int[cap];
            for (int i = 0; i <= pointer; i++) {
                temp[i] = S[i];
            }
            S = temp;
        }

        S[++pointer] = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int n = S[pointer];
        pointer--;
        return n;
    }

    /** Get the top element. */
    public int top() {
        return S[pointer];
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (pointer == -1) ? true: false;
    }
}
