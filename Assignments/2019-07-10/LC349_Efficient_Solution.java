package com.company;

import java.util.ArrayList;

public class LC349_Efficient_Solution {
    public static int[] LC349_Sorted (int[] nums3, int[] nums4) {
        ArrayList<Integer> interSec = new ArrayList<>();
        ArrayList<Integer> Nums3 = new ArrayList<>();
        ArrayList<Integer> Nums4 = new ArrayList<>();


        //deduplicate nums1
        int i = 1;
        Nums3.add(nums3[0]);
        while (i < nums3.length) {
            if (nums3[i] != nums3[i - 1])
                Nums3.add(nums3[i]);
            i++;
        }

        for (int j = 0; j < nums4.length; j++) {
            Nums4.add(nums4[j]);
        }

        for (int j = 0; j < Nums3.size(); j++) {
            if (Nums4.contains(Nums3.get(j))) {
                interSec.add(Nums3.get(j));
            }
        }

        int[] interSection = new int[interSec.size()];
        for (int n = 0; n < interSection.length; n++)
        {
            interSection[n] = interSec.get(n).intValue();
        }

//        System.out.println(interSec);

        return interSection;
    }
}
