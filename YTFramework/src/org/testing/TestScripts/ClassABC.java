package org.testing.TestScripts;

import java.util.Scanner;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassABC
{
 
	public static void main(String[] args)
	{
	 System.out.println("Please enter value of a and b");
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 int b=s.nextInt();
	 System.out.println("Please enter operator ");
	 int operator=s.nextInt();
	 int c;
	switch (operator) {
	case 1:
		c=a+b;
		System.out.println("Result is "+c);
		break;
	case 2:
		c=a-b;
		System.out.println("Result is "+c);
		break;
	case 3:
		c=a*b;
		System.out.println("Result is "+c);
		break;
	case 4:
		c=a/b;
		System.out.println("Result is "+c);
		break;

	default:
		System.out.println("Please enter correct operator ");
		break;
	}	
	}
	
}
