package Execution;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExecuteFramework {
	
	private WebDriver driver;
	private String browser;
	
	public ExecuteFramework(String browser) {
		this.browser = browser;
		this.setWebDriver();
	}
	
	public ExecuteFramework(String browser, String url) throws MalformedURLException {
		this.browser = browser;
		this.setWebDriver(url);
	}
	
	private void setWebDriver() {
		switch(browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			this.driver = new FirefoxDriver();

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	private void setWebDriver(String url) throws MalformedURLException {
		switch(browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			this.driver = new RemoteWebDriver(new URL(url), chromeOptions);
			break;
		case "firefox":

			FirefoxOptions firefoxOptions = new FirefoxOptions();
				this.driver = new RemoteWebDriver(new URL(url), firefoxOptions);

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	

}
