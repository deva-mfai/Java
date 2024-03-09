package com.mfai;

public class Student{
	String name;
	int age;
	String branch;
	
	public Student()
	{
		
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.add(1,2));
		Student obj1 = new Extended();
		System.out.println(obj1.add(1,2));
	}
	
}

class Extended extends Student
{
	@Override
	public int add(int a,int b)
	{
		return a*b;
	}
}



