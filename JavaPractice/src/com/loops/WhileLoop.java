package com.loops;

import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean f = true;
		do{
			System.out.println("************ Welcome To Jumanji ***********");
			System.out.println("Choose one of them.");
			System.out.println("1. View Info");
			int a = sc.nextInt();
			switch (a) {
			case 1: 
				{
					System.out.println("This is inforamtion pannel");
					System.out.println("Do you want to go back? y/n : ");
					String y = "y";
					String Y = "Y";
					String out = sc.next();
					if(out.equals(y) || out.equals(Y)) {
						continue;
					}
					else {
						f = false;
					}
					break;
				}
				
			case 2:
				{
					f = false;
				}
					
				
				default: {
					if(a<=2) {
						System.out.println("Thank You For Visting!");
					}
					else 
					{
						System.out.println();
						System.out.println("Service is not valid!! Please try again.");
						System.out.println();
					}
					
				}
			}
			
		}while(f);
	}
}
