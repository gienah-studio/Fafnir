package Coding.Training;

import Coding.Training.LC2019_07_10.LC349_Efficient_Solution;
import Coding.Training.LC2019_07_10.LC349_intersection;
import Coding.Training.LC2019_07_11.LC704_Binary_Search;
import Coding.Training.LC2019_07_12.LC350_Intersection_of_Two_Arrays;
import Coding.Training.LC2019_07_13.Bubble_Sort;
import Coding.Training.LC2019_07_13.Merge_Sort;
import Coding.Training.LC2019_07_21.LC121_maxProfit;
import Coding.Training.LC2019_07_21.LC122_maxProfit2;
import Coding.Training.LC2019_07_31.MinStack;
import Coding.Training.LC2019_08_04.MyQueue;
import Coding.Training.LC2019_08_04.MyStack;

public class Main {

    public static void main(String[] args) {

        /*---------------2019.07.10-------------*/
       // //LC349: intersection
       // int[] nums1 = {1,2,2,1};
       // int[] nums2 = {2,2};
       // System.out.println(LC349_intersection.intersection(nums1, nums2));

       // //LC349_Sorted
       // int[] nums3 = {1,1,2,2,5,5,5,6};
       // int[] nums4 = {1,2,2,3,3,4,4,5,6};
       // System.out.println(LC349_Efficient_Solution.LC349_Sorted(nums3, nums4));

        /*---------------2019.07.11-------------*/
       //LC704: Binary Search
       // int[] nums5 = {-3,-1,1,2,3,6,8};
       // int target = 2;
       // System.out.println(LC704_Binary_Search.search1(nums5, target));
       // System.out.println(LC704_Binary_Search.search2(nums5, target));
       // System.out.println(LC704_Binary_Search.search3(nums5, target));

        /*---------------2019.07.12-------------*/
       //LC350
       // int[] nums6 = {-3,-1,1,1,2,3,6,8};
       // int[] nums7 = {1,1,2,4};
       // System.out.println(LC350_Intersection_of_Two_Arrays.intersect(nums6, nums7));

        /*---------------2019.07.13-------------*/
        //Bubble Sort
//        int[] nums = {-3,-1,7,4,2,9,4,6,8};
//        System.out.println(Bubble_Sort.bubble_ascend(nums));
//        System.out.println(Bubble_Sort.bubble_descend(nums));

        // //Merge Sort
//        int[] nums_MS = {-1,-3,-2,4,4,2,9,6,8};
//        int i =0;
//        Merge_Sort.mergeSort(nums_MS, 0, nums_MS.length - 1, i);
//        System.out.println("排好序的数组：");
//        for (int e : nums_MS)
//            System.out.print(e+" ");

        /*----2019.07.21----*/
//        int [] nums = {3,2,6,5,0,3};
//        int [] prices = {7,3,10,2,4,9,8,2,4,6,1,10};
//        System.out.println(LC121_maxProfit.maxProfit_method2(nums));
//        System.out.println(LC122_maxProfit2.maxProfit(prices));

        /*---------------2019.07.31--------------*/
//        MinStack minStack = new MinStack();
//        minStack.push(2147483646);
//        minStack.push(2147483646);
//        minStack.push(2147483647);
//
//        System.out.println("top: " + minStack.top());
//        minStack.pop();
//        System.out.println(minStack.getMin());
//
//        minStack.pop();
//        minStack.pop();
//
//        minStack.push(2147483647);
//        System.out.println(minStack.getMin());
//        minStack.push(-2147483648);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.getMin());

        /*------------------2019.08.04-----------------*/
        MyStack s = new MyStack();
        for (int i = 0; i < 100; i++) {
            s.push(i);
        }
        System.out.println("MyStack Top element: " + s.top());
        System.out.println("MyStack popped element: " + s.pop());
        System.out.println("MyStack popped element: " + s.pop());
        System.out.println("MyStack is empty: " + s.empty());
        System.out.println("MyStack Top element: " + s.top());

        System.out.println();

        MyQueue queue = new MyQueue();
        for (int i = 0; i < 20; i++) {
            queue.push(i);
        }

        System.out.println("MyQueue peek element: " + queue.peek());
        System.out.println("MyQueue popped element: " + queue.pop());
        System.out.println("MyQueue popped element: " + queue.pop());
        System.out.println("MyQueue peek element: " + queue.peek());
        System.out.println("MyQueue is empty: " +queue.empty());


    }
}
