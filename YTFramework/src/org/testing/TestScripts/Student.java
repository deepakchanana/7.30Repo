package org.testing.TestScripts;

public class Student
{
	public Student() 
	{
	 System.out.println("This is default constructor");
	}
	public Student(int a,int b) 
	{
	 System.out.println("This is two parameterized constructor");
	}
	public Student(int a) 
	{
	 System.out.println("This is one parameterized constructor");
	}
	public Student(int a,int b,int c) 
	{
		this(345,56); // control will go to two
	 System.out.println("This is three parameterized constructor");
	}
	

	public static void main(String[] args) 
	{
	 Student ob=new Student(345,343,4);  // control will go to one 
	
	}
}
