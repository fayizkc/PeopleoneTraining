package ObjectRespository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	
	@FindBy(name="userId")
	private WebElement objEmail1;
	
	private By objEmail = By.id("email");
	private By objpw = By.name("pw");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginObject() {
		return objEmail1;
	}
	

	
	public void initLoginPage() {
		driver.navigate().to("https://phptravels.net/login");
	}
	
	public void loginPage(String email, String password) {
		
//		String xpathuserName = prop.getProerty("objusername");
		
		objEmail1.click();
		objEmail1.clear();
		objEmail1.sendKeys(email);
		
		
		driver.findElement(objEmail).clear();
		driver.findElement(By.name("email")).sendKeys(email);
		
		driver.findElement(objpw).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	

}
