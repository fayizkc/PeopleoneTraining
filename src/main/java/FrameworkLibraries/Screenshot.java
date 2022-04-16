package FrameworkLibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	private WebDriver driver;
	private WebElement ele;
//	private String fileName;
	
//	public Screenshot(WebDriver driver, String fileName) {
//		this.driver=driver;
//		this.fileName=fileName;
//	}

//	public Screenshot(WebElement ele, String fileName) {
//		this.ele=ele;
//		this.fileName = fileName;
//	}
	
	public Screenshot(WebDriver driver) {
		this.driver=driver;
//		this.fileName=fileName;
	}

	public Screenshot(WebElement ele) {
		this.ele=ele;
//		this.fileName = fileName;
	}
	
	public void takeScreenshot(String fileName) throws IOException  {
		try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("Screenshots/"+ fileName  + ".png"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void takeScreenshosOfEle(WebElement ele, String fileName) {
		 try {
		//		WebElement element = driver.findElement(By.cssSelector("h1"));
			 File scrFile = ele.getScreenshotAs(OutputType.FILE);	
			FileUtils.copyFile(scrFile, new File("Screenshots/"+ fileName  + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	
}
