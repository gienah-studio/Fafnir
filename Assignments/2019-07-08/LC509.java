package com.example.demo;

import java.util.ArrayList;


public class LC509 {
	
	/*   Method 1  */
	public static int fib(int N) {
		if(N == 0 || N == 1)
			return N;
		
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		for (int i = 0; i < N - 1; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return f3;
	}
	
	/*   Method 2:
	 * According to the ppt
	 * */
	public static int dynamic(int N) {
		int f = 1;
		int g = 0;
		while (0 < N--) {
			g += f;
			f = g - f;
		}
		return g;
	}
	
	/*   Method 3: 
	 * Save a List, find N */
	public static int list(int N) {
		ArrayList<Integer> fibonacciList = new ArrayList<>();
		int f0 = 0;
		int f1 = 1;
		fibonacciList.add(f0);
		fibonacciList.add(f1);
		for (int i = 0; i < 30; i++) {
			int f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			fibonacciList.add(f2);
		}
		return fibonacciList.get(N);
	}
	
	public static void main(String[] args) 
    { 
        int N = 1; 
        System.out.println("Method1:"+ fib(N)); 
        System.out.println("Method2:"+ dynamic(N));
        System.out.println("Method2:"+ list(N));
    }
}
