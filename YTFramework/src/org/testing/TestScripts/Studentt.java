package org.testing.TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Studentt 
{

	@Test
	public void testCase1()
	{
		System.out.println("I am test case1");
	}
	
	@Test(dependsOnMethods="testCase1")
	public void testCase2()
	{
		System.out.println("I am test case2");
	}
	
	@BeforeTest
	public void bjsuite()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bsuitke()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bddsuite()
	{
		System.out.println("Before Method");
	}
	@AfterTest
	public void bsjjjuite()
	{
		System.out.println("After Test");
	}
	@AfterClass
	public void bsjjkkuite()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void dbsjjuite()
	{
		System.out.println("After Method");
	}
	@AfterSuite
	public void bsjjuite()
	{
		System.out.println("After Suite");
	}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
}
