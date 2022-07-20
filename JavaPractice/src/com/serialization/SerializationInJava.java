package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInJava {

	public static void main(String[] args) {
		
		Student s1 = new Student((byte)130,"Rohan");
		
		try {
			// Serialization
			FileOutputStream fout = new FileOutputStream("f.text");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("Successful !!");
			
			// Deserialization
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("f.text"));
			Student s = (Student) input.readObject();
			System.out.println(s.getName() + " " + s.getAge());
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
