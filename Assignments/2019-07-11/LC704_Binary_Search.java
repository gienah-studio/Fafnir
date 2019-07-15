package Coding.Training.LC2019_07_11;

import java.util.ArrayList;

public class LC704_Binary_Search {

    /*------------ Method1 ------------*/
    public static int search1(int[] nums5, int target) {
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

        return target == nums5[--lo] ? --lo : -1;
    }

    /*------------ Method2 ------------*/
    /* 根据ppt可知可以用Fibonacci查找算法，
    但是有些疑问，144页的fib.get()括号内应该是什么？
    解决疑问后应能写出来！*/
    public static int search2(int[] nums5, int target) {

//        ArrayList<Integer> fibonacciList = new ArrayList<>();
//        int f0 = 0, f1 = 1, N = 10000;
//        fibonacciList.add(f0);
//        fibonacciList.add(f1);
//        for (int i = 0; i < N; i++) {
//            int f2 = f0 + f1;
//            f0 = f1;
//            f1 = f2;
//            fibonacciList.add(f2);
//        }
//
//        int _hi = nums5.length;
//        int _lo = 0;

//
//        return target == nums5[--_lo] ? --_lo : -1;
        return 0;
    }

}
