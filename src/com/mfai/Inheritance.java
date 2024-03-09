package com.mfai;

public class Inheritance {
	
	 int print(String name)
	{
		System.out.println("Hello "+ name);
		print1();
		return 0; 
	}
	
	 void print1()
	 {
		 System.out.println("Print 1 Called");
		 print3();
	 }
	 
	 static void print3()
	 {
		 System.out.println("Print Static");
		 Inheritance obj = new Inheritance();
		 obj.print("Keerthika");
		
	 }
	 
	static public void main(String[] args) 
	{
		//print();
		Inheritance obj = new Inheritance();
		obj.print("Guru Balaji");
	}
}


//Function or Method 
//
//  accessModifier non-accessModifier returnType methodName(Aruguments)
//										|           |
//										Mandatory