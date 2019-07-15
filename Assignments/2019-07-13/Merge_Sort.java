package Coding.Training.LC2019_07_13;

import static Coding.Training.LC2019_07_13.Bubble_Sort.ASC_sort;
import static Coding.Training.LC2019_07_13.Bubble_Sort.bubble_descend;

public class Merge_Sort {
    /*
    We can use Bubble_Sort to sort each array firstly, then combine them to one array.
    Begin to compare two elements with lowest rank from those two sorted array_A and array_B.
    Put the smaller one (Assume it from array_A) into the new array firstly, which it could have the lowest rank.
    Compare the larger with the second element from array_B. Pick the smaller one into the new array.

    If two elements from two array are same, picking any of them is fine.

     */

    public static int[] mergeSort_ASC (int[] nums_A, int[] nums_B) {
        //Sort two arrays firstly
        int a_lo = 0, a_hi = nums_A.length, b_lo = 0, b_hi = nums_B.length, i = 0;

        int[] arrayA = Bubble_Sort.bubble_ascend(nums_A);
        int[] arrayB = Bubble_Sort.bubble_ascend(nums_B);
        int[] mergeArray = new int[a_hi + b_hi];

        while (a_lo < a_hi && b_lo < b_hi) {
            if (arrayA[a_lo] >= arrayB[b_lo]) {
                mergeArray[i] = arrayB[b_lo];
                b_lo++;
                i++;
            } else {
                mergeArray[i] = arrayA[a_lo];
                a_lo++;
                i++;
            }
        }

        if (b_lo > a_lo) {
            while (a_lo < a_hi) {
                mergeArray[i] = arrayA[a_lo];
                a_lo++;
                i++;
            }
        } else if (b_lo < a_lo) {
        while (b_lo < b_hi) {
            mergeArray[i] = arrayB[b_lo];
            b_lo++;
            i++;
        }
        }else {
                return mergeArray;
            }

//        System.out.print("Ascend Merge sort: ");
//        for (int j = 0; j < mergeArray.length; j++) {
//            System.out.print(mergeArray[j] + " ");
//        }

        return mergeArray;
    }

    public static int[] mergeSort_DESC (int[] nums_A, int[] nums_B) {

        int[] DESC_mergeArray = bubble_descend(mergeSort_ASC(nums_A,nums_B));

//        System.out.print("Descend Merge sort: ");
//        for (int j = 0; j < DESC_mergeArray.length; j++) {
//            System.out.print(DESC_mergeArray[j] + " ");
//        }

        return DESC_mergeArray;
    }

}
