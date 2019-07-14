package Coding.Training.LC2019_07_12;

import java.util.ArrayList;
import java.util.HashMap;

public class LC350_Intersection_of_Two_Arrays {
    public static int[] intersect(int[] nums6, int[] nums7) {
        HashMap<Integer, Integer> nums1 = new HashMap<>();

        for (int num: nums6) {
            nums1.put(num, nums1.getOrDefault(num, 0) + 1);
        }

        System.out.println(nums1);

        ArrayList<Integer> intersectArray = new ArrayList<>();
        for (int n2: nums7) {
            if (nums1.containsKey(n2) && nums1.get(n2) != 0){
                intersectArray.add(n2);
                nums1.put(n2, nums1.getOrDefault(n2, 0) - 1);
            }
        }

        int[] intersect = new int[intersectArray.size()];
        for (int i = 0; i < intersect.length; i++) {
            intersect[i] = intersectArray.get(i);
        }

//        System.out.println(intersectArray);

        return intersect;
    }
}
