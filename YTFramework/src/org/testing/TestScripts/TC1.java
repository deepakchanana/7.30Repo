package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.Assertions.Assertion;
import org.testing.Assertions.Assertion1;
import org.testing.Base.Base;
import org.testing.Pages.Home;
import org.testing.Pages.HomePage;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC1 extends Base
{
	@Test
	public void testCase1() throws IOException
	{
	 String expectedUrl="https://www.youtube.com";	
     Login login=new Login(driver,pr);
     login.signin("deepakddeep", "passwordd");
     Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
     Assertion1.assert1(driver.getCurrentUrl(), expectedUrl);
     LogsCapture.takelog("login successfully for TC1","TC1");
     ScreenshotCapture.takeScreenshot(driver, "D://screenshots//first_1.png");
	 Home home=new Home(driver, pr);
	 home.trendingClick();
	 ScreenshotCapture.takeScreenshot(driver, "D://screenshots//first_2.png");
	 LogsCapture.takelog("TestCase1 pass successfully ","TC1");
	}
	
	
}
