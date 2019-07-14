package Coding.Training;

import Coding.Training.LC2019_07_10.LC349_Efficient_Solution;
import Coding.Training.LC2019_07_10.LC349_intersection;
import Coding.Training.LC2019_07_11.LC704_Binary_Search;
import Coding.Training.LC2019_07_12.LC350_Intersection_of_Two_Arrays;
import Coding.Training.LC2019_07_13.Bubble_Sort;
import Coding.Training.LC2019_07_13.Merge_Sort;

public class Main {

    public static void main(String[] args) {

        /*---------------2019.07.10-------------*/
//        //LC349: intersection
//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
//        System.out.println(LC349_intersection.intersection(nums1, nums2));
//
//        //LC349_Sorted
//        int[] nums3 = {1,1,2,2,5,5,5,6};
//        int[] nums4 = {1,2,2,3,3,4,4,5,6};
//        System.out.println(LC349_Efficient_Solution.LC349_Sorted(nums3, nums4));

        /*---------------2019.07.11-------------*/
//        //LC704: Binary Search
//        int[] nums5 = {-3,-1,1,2,3,6,8};
//        int target = 2;
//        System.out.println(LC704_Binary_Search.search1(nums5, target));
//        System.out.println(LC704_Binary_Search.search2(nums5, target));
////        System.out.println(LC704_Binary_Search.search3(nums5, target));

        /*---------------2019.07.12-------------*/
//        //LC350
//        int[] nums6 = {-3,-1,1,1,2,3,6,8};
//        int[] nums7 = {1,1,2,4};
//        System.out.println(LC350_Intersection_of_Two_Arrays.intersect(nums6, nums7));

        /*---------------2019.07.13-------------*/
        //Bubble Sort
        int[] nums = {-3,-1,7,4,2,9,4,6,8};
        System.out.println(Bubble_Sort.bubble_ascend(nums));
        System.out.println(Bubble_Sort.bubble_descend(nums));

        //Merge Sort
        int[] nums_A = {-3,-1,7,4,4,2,9,6,8};
        int[] nums_B = {5,3,10,1,12,3,11,15,-2};
        System.out.println(Merge_Sort.mergeSort_ASC(nums_A,nums_B));
        System.out.println(Merge_Sort.mergeSort_DESC(nums_A,nums_B));

    }
}
