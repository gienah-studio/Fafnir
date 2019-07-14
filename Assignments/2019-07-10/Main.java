package com.company;

public class Main {

    public static void main(String[] args) {
        //LC349: intersection
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(LC349_intersection.intersection(nums1, nums2));

        //LC349_Sorted
        int[] nums3 = {1,1,2,2,5,5,5,6};
        int[] nums4 = {1,2,2,3,3,4,4,5,6};
        System.out.println(LC439_Efficient_Solution.LC349_Sorted(nums3, nums4));
    }
}
