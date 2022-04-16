package org.testing.TestScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCase {
	static ChromeDriver driver;
	public static void main(String[] args) {
		System.setProperty(" "," ");
		driver=new ChromeDriver();
		driver.get("youtube");
		Login login=PageFactory.initElements(driver, Login.class);
		login.loginaction("deepakdeep", "passworddd");
		
		
	}

}
