package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}

	public void signin(String user,String password)
	{
	WebElement login=driver.findElement(By.id(pr.getProperty("loginbutton")));
	login.click();
	}
	
}
