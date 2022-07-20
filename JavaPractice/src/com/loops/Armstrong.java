package com.loops;

public class Armstrong {
	public static void main(String[] args) {
	       int a = 5635;
	       
	       int x = a;
	        int r = 0;
	        int temp = 0;
	        int i = 0;
	        while (a != 0)
	        {
	        	i++;
	            r = a % 10;
//	            System.out.print(r+",");
	            temp = temp + r;
	            a = a/10;
	        }
	        System.out.println("Given number: " + x);
	        System.out.println("Addition of the given number: " + temp);
	        System.out.println("Total available digits in given number is: " + i);
	}
}
