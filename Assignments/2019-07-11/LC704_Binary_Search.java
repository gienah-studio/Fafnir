package Coding.Training.LC2019_07_11;

import java.util.ArrayList;

public class LC704_Binary_Search {
    /*------------ Method1 三路 ------------*/
    public static int search1(int[] nums5, int target) {
        int hi = nums5.length;
        int lo = 0;

        while (lo < hi) {
            int mi = (lo + hi) >> 1;
            if (target < nums5[mi]) {
                hi = mi;
            } else if (target > nums5[mi]) {
                lo = mi + 1;
            } else {
                return mi;
            }
        }

        return -1;
    }

    /*------------ Method2 二路------------*/
    public static int search2(int[] nums5, int target) {
        int hi = nums5.length;
        int lo = 0;
        while (hi > lo) {
            int mi = (lo + hi) >> 1;
            if (target < nums5[mi]) {
                hi = mi;
            } else {
                lo = mi + 1;
            }
        }

        return --lo;
    }

}
