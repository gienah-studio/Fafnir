package Coding.Training.LC2019_08_04;

public class MyQueue {
    private int CAPACITY = 10;
    private int[] S;
    private int header = 0;
    private int size = 0;
    private int pointer = -1;

    /** Initialize your data structure here. */
    public MyQueue() {
        S = new int[CAPACITY];
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        int cap = pointer + 2;
        if (cap > CAPACITY) { // Expand the capacity
            cap *= 2;
            int[] temp = new int[cap];
            for(int i = 0; i <= pointer; i++) {
                temp[i] = S[i];
            }
            S = temp;
        }

        S[++pointer] = x;
        size++;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int n = S[header];
        size--;
        header++; // Update header to new first element
        return n;
    }

    /** Get the front element. */
    public int peek() {
        return S[header]; // Return current first element
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return (size == 0) ? true: false;
    }
}
