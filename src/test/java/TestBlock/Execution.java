package TestBlock;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FrameworkLibraries.ExternalFiles;
import ObjectRespository.LoginPage;

public class Execution {
	public static void main(String[] args) {
		
//		WebDriver driver = null;
//		
//		for(String page: driver.getWindowHandles()) {
//			driver.switchTo().window(page);
//			if(driver.getTitle()!="HOME")
//				driver.close();
//		}
		
		
		
		
		
		try {
			ExternalFiles.createYamlObject("ObjectRepository/OR.yml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String a = args[0] ;
		
//		WebDriver driver=new ChromeDriver();
//		
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.initLoginPage();
//		loginPage.loginPage("user", "pw");
//		loginPage.getLoginObject().click();

//		VirifyPage()
		
		
//		signUp.enterUserDetaio()
		
		
		
	}
}
