package com.practice;

import java.util.ArrayList;
import java.util.List;

// Type casting..
// Narrow casting
// Winding casting

public class JavaProgramming {
	public static void main(String[] args) {
		
//		char ch = 'A';
//		byte value = (byte) ch;
//		
//		char c = (char)value;
//		
//		System.out.println(c);	
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		

		String s = "90";
		
		int b = Integer.parseInt(s);
		System.out.println(b);

	}

}
