package com.conditional_operators;

public class Result {
	public static void main(String[] args) {
		
		String name = "name";
		byte marks = 30;
		
		if(marks >=50) {
			
			System.out.println("Your are pass!!");
			
			
			if(marks >=90) {
				System.out.println("Grade: S");
			}
			else if(marks >= 80 && marks < 90) {
				System.out.println("Grade: A");
			}
			else if(marks >=70 && marks < 80) {
				System.out.println("Grade: B");
			}
			else if(marks >=50 && marks < 70) {
				System.out.println("Grade: C");
			}
		}
		else {
			System.out.println("Fail Grade: U");
			 int x = 10;  
			  int y = 20;  
			  System.out.println("value of x:" + x);  
			  System.out.println("value of y:" + y); 
			  x = x + y;  // 10 + 20 = 30
			  
			  y = x - y;  // 30 - 20 = 10 
			  x = x - y;  // 30 - 10 = 20
			  
			  
			  System.out.println("swapped value of x:" + x);  
			  System.out.println("swapped value of y:" + y);  
		}
	}
}
