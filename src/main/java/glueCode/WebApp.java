package glueCode;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Execution.ExecuteFramework;
import FrameworkLibraries.ExternalFiles;
import FrameworkLibraries.FWLogger;
import FrameworkLibraries.FrameworkException;
import FrameworkLibraries.Report;
import FrameworkLibraries.ScenarioContext;
import FrameworkLibraries.Screenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class WebApp  extends BaseStepDef {
	
//	private WebDriver driver;
	private Properties objRepo;
//	Screenshot ss;

//	ScenarioContext sc = new ScenarioContext();
	private Report report;
	
	
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("****Execution starting****");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("****Execution DONE****");
	}
	
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		super.beforeStep(scenario);
	}
	
	@Before("@WEB")
//	@Before()
	public void initBrowser() {
		super.beforeHook();
//		System.out.println("Initlizing browser");
//		ExecuteFramework execute = new ExecuteFramework("firefox");
//		this.driver=execute.getWebDriver();
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] data =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(data, "image/png", "Failed");
		}
		
		if(driver!=null)
			driver.quit();
	}
	

	
	
	@When ("Launch {string}")
	public void launchApp(String url) throws IOException, FrameworkException {
		
		
		driver.get(url);
		
		String pageTitile = driver.getTitle();
		wrtireLogAndResult("Launching '" + pageTitile + "' applicaiton..");
		

	}
	
	@Given("Launch {string} in {word} browser")
	public void launchAppInBrowser(String url, String browser) throws IOException, FrameworkException {
		
		ExecuteFramework execute = new ExecuteFramework(browser,"http://192.168.1.9:4444/");
	
		
		this.driver=execute.getWebDriver();
		
		launchApp(url);
//		try {
//			objRepo = ExternalFiles.readPropertiesFile("ObjectRepository\\Objectrepository.properties");
//		} catch (IOException e) {
		
	}
	
	@When ("click on {word} tab")
	public void selectTab(String tabName) throws IOException {	
		
		String flightXpath = "//span[normalize-space()='"+ tabName + "']";
		
		if (driver.findElements(By.xpath(flightXpath)).size() == 0 ) {
			System.out.println("Object not found");
		}
		
		
		
		flightXpath = "//span[normalize-space()='"+ tabName + "']";
		driver.findElement(By.xpath(flightXpath)).click();
		

		
		logger.info("Clicked on " + tabName);;
//		ss.takeScreenshot("Flight");
		
		
	}
	
	@When ("Search One Way Route:")
	public void searchFlight( Map<String,String> data)  {
//		try {
		driver.findElement(By.name("from")).clear();
		driver.findElement(By.name("from")).sendKeys(data.get("from"));
		driver.findElement(By.xpath("//b[text()='" + data.get("from") + "']")).click();
		
//		ss.takeScreenshosOfEle(	driver.findElement(By.name("from")), "from");
		
		//b[text()='DXB']
		
		driver.findElement(By.name("to")).clear();
		driver.findElement(By.name("to")).sendKeys(data.get("to"));
		driver.findElement(By.xpath("//b[text()='" + data.get("to") + "']")).click();
 

		System.out.println("Search Flight...");
		
//		}catch(exception e) {
//			
//		}
		
	
		
	}
	
	@When ("Click on {word} object") 
	public void clickOnObject(String key) {
//		objRepo.
		
		System.out.println(objRepo.getProperty(key));
//		System.out.println(objRepo.getProperty("ObjPw"));
		driver.findElement(By.xpath(objRepo.getProperty(key))).click();
	}
			
	@When ("test Action")
	public void keyActions() {
		
		WebElement ele = driver.findElement(By.id("departure"));
		ele.click();
//		WebElement ele = driver.findElement(By.name("to"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	}
	
	public boolean objectExisit(By path) {
		try {
			driver.findElement(path);
			return true;
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	
	
	

}
