package org.testing.TestScripts;

import org.testng.annotations.Test;

public class ClassB 
{

	@Test(priority=2)
	public void method1()
	{
		System.out.println("I am ClassB one method");
	}
	@Test(priority=3)
	public void method2()
	{
		System.out.println("I am ClassB second method");
	}
	
}
