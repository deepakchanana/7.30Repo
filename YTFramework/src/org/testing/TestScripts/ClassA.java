package org.testing.TestScripts;

import org.testng.annotations.Test;

public class ClassA
{

	@Test(priority=0)
	public void method1()
	{
		System.out.println("I am ClassA one method");
	}
	@Test(priority=1)
	public void method2()
	{
		System.out.println("I am ClassA second method");
	}
}

