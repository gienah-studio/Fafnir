package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class LC349_intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        /*  Method1 */
        ArrayList<Integer> interSec = new ArrayList<>();
        ArrayList<Integer> Nums2 = new ArrayList<>();

        //deduplicate nums1
        HashSet set = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Integer[] Nums1 = new Integer[set.size()];
        set.toArray(Nums1);

        //convert int[] to ArrayList
        for (int i = 0; i < nums2.length; i++) {
            Nums2.add(nums2[i]);
        }

        for (int i = 0; i < Nums1.length; i++) {
            if (Nums2.contains(Nums1[i])) {
                interSec.add(Nums1[i]);
            }
        }

        int[] interSection = new int[interSec.size()];
        for (int i=0; i < interSection.length; i++)
        {
            interSection[i] = interSec.get(i).intValue();
        }

        return interSection;


    }

}
