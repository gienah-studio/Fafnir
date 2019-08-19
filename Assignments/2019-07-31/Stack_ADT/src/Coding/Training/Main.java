package Coding.Training;

public class Main {

    public static void main(String[] args) {
        Stack_Array test = new Stack_Array();

        test.push(12);
        test.push(15);
        System.out.println("Size of stack array: " + test.getSize());

        System.out.println("Extract the top item of the stack: " + test.pop());
        System.out.println("Size of stack array: " + test.getSize());

        System.out.println("Show the top item of the stack: " + test.top());
        System.out.println("Size of stack array: " + test.getSize());

        test.pop();
        test.top();

    }
}
