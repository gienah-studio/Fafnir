package Coding.Training.LC2019_07_13;

public class Bubble_Sort {

    /*
    If the former is larger than the latter one, swap.
    If the former is not larger than the latter one, keep no change.
    Every time we can only compare one element from the left to right.
    So, we need to check if the sorted is completed every time.
    If the array has been sorted, return true.
    If the array has not been sorted, return false and sort it again.
     */

    public static int[] bubble_ascend (int[] nums) {
        int lo = 0, hi = nums.length;

        //If the ASCsort function return false, then sort it again.
        while ( ASC_sort(nums, lo, hi--) == false);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

        return nums;
    }

    public static int[] bubble_descend (int[] nums) {
        int lo = 0, hi = nums.length;

        while ( DESC_sort(nums, lo, hi--) == false);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

        return nums;
    }

    public static boolean ASC_sort (int[] nums, int lo, int hi) {
        boolean sorted = true;

        //Every time we compare one element from the left to right.
        while (++lo < hi) {
            //If the former is larger than the latter one, swap.
            if (nums[lo - 1] > nums[lo]) {
//                System.out.println(nums[lo-1] + "," + nums[lo]);
                sorted = false;
                int temp = nums[lo];
                nums[lo] = nums[lo - 1];
                nums[lo - 1] = temp;
            }
        }

        return sorted;
    }

    public static boolean DESC_sort (int[] nums, int lo, int hi) {
        boolean sorted = true;

        while (++lo < hi) {
            if (nums[lo - 1] < nums[lo]) {
//                System.out.println(nums[lo-1] + "," + nums[lo]);
                sorted = false;
                int temp = nums[lo];
                nums[lo] = nums[lo - 1];
                nums[lo - 1] = temp;
            }
        }

        return sorted;
    }

}
