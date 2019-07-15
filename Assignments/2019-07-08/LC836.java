package com.example.demo;

public class LC836 {
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		int x1 = rec1[0];
		int y1 = rec1[1];
		int x2 = rec1[2];
		int y2 = rec1[3];
		
		int a1 = rec2[0];
		int b1 = rec2[1];
		int a2 = rec2[2];
		int b2 = rec2[3];
		
		if (b1 >= y2 || a1 >= x2 || b2 <= y1 || a2 <= x1)
		{
			return false;
		}
		
		return true;
    }
	
	public static void main(String[] args) 
    {
        int[] rec1 = {0,0,1,1};
        int[] rec2 = {1,0,2,1};
        System.out.println("Method1:"+ isRectangleOverlap(rec1,rec2));

    }
}
