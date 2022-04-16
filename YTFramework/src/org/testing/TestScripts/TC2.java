package org.testing.TestScripts;

public class TC2 {
	
	int a,b,c,d,e;  // 5 global variables
	public static void main(String[] args) 
	{
	  TC2 obj1=new TC2();
	  obj1.a=22;  // 1st
	  obj1.b=12;   // 2nd
	  obj1.c=333;   // 3rd
	  obj1.d=332;    // 4th
	  obj1.e=1222;    // 5th
	  
	  System.out.println(obj1.a);
	  System.out.println(obj1.b);
	  System.out.println(obj1.c);
	  System.out.println(obj1.d);
	  System.out.println(obj1.e);
	  
	}	

}
