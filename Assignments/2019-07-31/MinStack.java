package Coding.Training.LC2019_07_31;

public class MinStack {

    private final static int CAPACITY = 1;
    protected int[] S;
    protected int[] minS; // Used to save the min stack
    protected int pointer = -1;
    protected int minPointer = -1;
    private int minValue = Integer.MAX_VALUE; // Save current minimum value

    public MinStack() {
        S = new int[CAPACITY];
        minS = new int[CAPACITY];
    }

    public MinStack(int size) {
        S = new int[size];
        minS = new int[size];
    }

    public void push(int x) {
        int cap = pointer + 1, minCap = minPointer + 1;
        if (cap >= S.length) { // Expand the stack capacity
            int[] temp = new int[cap * 2];
            for(int i = 0; i < S.length; i++) {
                temp[i] = S[i];
            }
            S = temp;
        }

        S[++pointer] = x;

        if (minCap >= minS.length) { // Expand the minStack capacity
            int[] tempMin = new int[minCap * 2];
            for(int i = 0; i < minS.length; i++) {
                tempMin[i] = minS[i];
            }
            minS = tempMin;
        }

        if (x <= minValue) {
            minValue = x;
            minS[++minPointer] = minValue;
        }


    }

    public void pop() {
        // System.out.println("Removed the top element of mS："+ S[pointer]);
        int popElem = S[pointer];
        /*Compared popped element with the top element of the minStack. If they are same, then remove the top element of minStack*/
        if (popElem == minS[minPointer]) {
            minPointer--;
        }

        pointer--;
        // System.out.println("Removed the top element of minS："+ minS[minPointer]);

        if (pointer < 0) {
            minValue = Integer.MAX_VALUE; // If there no element in the array, set minimum value to Integer.MAX_VALUE
        } else {
            minValue = minS[minPointer]; // Set minimum value the new int which index is equal to minPointer.
        }
    }

    public int top() {
        return S[pointer];
    }

    public int getMin() {
        return minS[minPointer];
    }

}
