package Coding.Training;

public class Main {

    public static void main(String[] args) {
         LinkedList2 test = new LinkedList2();

         test.insertFirst(12);
         test.insertFirst(15);
         test.insertLast("abc");

         System.out.println("Get array size: " + test.getSize());
         System.out.println("Get first element: " + test.getFirst());
         System.out.println("Get last element: " + test.getLast());

         System.out.println("Remove the first element: " + test.removeFirst());
         test.removeLast();
         System.out.println("Get first element: " + test.getFirst());
         System.out.println("Get array size: " + test.getSize());


    }
}
