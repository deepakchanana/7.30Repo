package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC 
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(" "," ");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get(" ");
	    WebElement e1=driver.findElement(By.id(" "));

	    WebDriverWait w=new WebDriverWait(driver, 5);
	    w.until(ExpectedConditions.visibilityOf(e1));
	    w.until(ExpectedConditions.elementToBeClickable(e1));
	   
	}
}
