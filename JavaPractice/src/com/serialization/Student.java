package com.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 1000L;
	
	private byte age;
	private String name;
	
	public Student(byte age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
