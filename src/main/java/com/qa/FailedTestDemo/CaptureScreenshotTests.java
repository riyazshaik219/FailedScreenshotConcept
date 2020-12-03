package com.qa.FailedTestDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenshotTests extends MainTest {
@Test
	public void captureScreenshot() {
		
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		String actual=driver.getTitle();
		Assert.assertEquals(actual, "Home-Automation Test");
		driver.quit();
	}
}
