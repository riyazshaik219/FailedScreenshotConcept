package com.qa.FailedTestDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class GetScreenshot extends MainTest {

	public static void capture(String ScreenshotName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Automation\\FailedScreenshotConcept\\Images\\"+ScreenshotName+".png");
		FileUtils.copyFile(source, dest);
		
		
	}
}
