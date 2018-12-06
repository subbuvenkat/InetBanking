package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UtilityTakeSecreenshot {
	@Test
public void screenshot(WebDriver driver){
		try{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sources=ts.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(sources,new File("*./TestingProject/screenshot.png") );
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
