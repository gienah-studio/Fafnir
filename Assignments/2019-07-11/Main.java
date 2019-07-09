package Coding.Training;

import Coding.Training.LC2019_07_10.LC349_Efficient_Solution;
import Coding.Training.LC2019_07_10.LC349_intersection;
import Coding.Training.LC2019_07_11.LC704_Binary_Search;

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
        //LC704: Binary Search
        int[] nums5 = {-3,-1,1,2,3,6,8};
        int target = 2;
        System.out.println(LC704_Binary_Search.search1(nums5, target));
        System.out.println(LC704_Binary_Search.search2(nums5,target));

    }
}
