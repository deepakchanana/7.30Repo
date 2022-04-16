package org.testing.TestScripts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	ChromeDriver driver;
	@Before
	public void be()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		
		System.out.println("Before annotation");
	}
	@Test
	public void xyz()
	{
		
		System.out.println("I am testcase1");
	}
	
	
	
	@After
	public void af()
	{
		System.out.println("After");
	}
}
