package FrameworkLibraries;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class Report {
	
	private Scenario scenario;
	private WebDriver driver;
	
	public Report(Scenario scenario, WebDriver driver) {
		this.scenario = scenario;
		this.driver = driver;
	}
	
	public void addResult(String result, String status) throws FrameworkException {
		
		if(status.equalsIgnoreCase("passed")) {
			scenario.log(result);
		}else {
			byte[] data =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(data, "image/png", "Failed");
			
			
			throw new FrameworkException(result);
		}
		
	 
		 
	}
	

}
