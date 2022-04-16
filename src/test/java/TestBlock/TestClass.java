package TestBlock;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {
		
		
		ArrayList<String> strArray = new ArrayList<String>();
		
		strArray.add("A");
		strArray.add("B");
		strArray.add("C");
		
ArrayList<String> strArray1 = new ArrayList<String>();
		
		strArray.add("a");
		strArray.add("b");
		strArray.add("c");
		
		List<List<String>> lstA = new ArrayList<List<String>>();
		
		lstA.add(strArray);
		lstA.add(strArray1);
		
		for(List<String> item: lstA ) {
			item.get(0);
			for(String i2:item ) {
				System.out.println(i2);
			}
			
		}
		
		
		
//		HashMap <String, List<String>> obj = new HashMap <String, List<String>>();
//		
//		ArrayList<String> intArr = new ArrayList<String>();
//		
//		
//		List<List<String>> arrL = new  ArrayList<List<String>>();
//		
//		obj.put("Name", intArr);
//		obj.put("Age", null);
//		obj.put("Year", null);
//		obj.put(null, 0);
//		
//		System.out.println(obj.get("Year"));
////		obj.remove("Age");
//		
//		System.out.println(obj.size());
//		
////		for(String key:obj.keySet()) {
////			System.out.println(key);
////		}
////		
//		for(Integer key:obj.values()) {
//			System.out.println(key);
//		}
//		
//		for(String key:obj.keySet()) {
//			System.out.println(key);
//			System.out.println(obj.get(key));
//		}
////		obj.put("Year", "20");
//		System.out.println(obj.get("Year"));
//		
//		
//		ArrayList<Integer> intArr = new ArrayList<Integer>();
////		intArr.add("A")
//		
//		ArrayList<TestObj> obj = new ArrayList<TestObj>();
//		
//		TestObj obj1 = new TestObj();
//		
//		obj.add( null);
//		obj.add(new TestObj() );
//		obj.add(new TestObj() );
//		obj.add(null );
//		
//		String str1 ="a";
//		String a1="";
//		for(TestObj o:obj) {
//			//System.out.println(o.getBrowserName());
//			
//			a1 = a1+ ":" + str1;
//			o.setBrowser(a1);
//		}
//		
//		for(TestObj o:obj) {
//			System.out.println(o.getBrowserName());
//			//o.setBrowser(s+s);
//		}
//		
//		
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("one");
//		arr.add("Two");
//		arr.add("Three");
//		arr.add("1");
//		arr.add("5");
//		
//		Iterator<String> it = arr.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		
//
//		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
//		arr.set(1, "Second");
//		System.out.println(arr);
//		System.out.println(arr.get(2));
//		
//		System.out.println(arr.size());
//		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
//		Collections.sort(arr);
//		
//		for(String s:arr) {
//			System.out.println(s);
//		}
//		
//		arr.remove(0);
//		System.out.println(arr);
////		System.out.println(arr.get(2));
//		
//		arr.clear();
//		System.out.println(arr);
//		arr.add("Chennai");

//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		
	
		 
//		 System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
//		 WebDriver driver = new EdgeDriver();
		 
//		 System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
//		 WebDriver driver = new FirefoxDriver();
//		 
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		 
//		 driver.get("https://phptravels.net/");
//		 
//		 String flightXpath = "//span[normalize-space()='flights']";
//		 driver.findElement(By.xpath(flightXpath)).click();

		 
//		 WebElement objLnk = driver.findElement(By.linkText("Best Sellers"));
//		 
//		 WebElement obja = driver.findElement(By.tagName("a"));		 
//		 obja.click();
//		 
//		 List<WebElement> objAllA = driver.findElements(By.tagName("a"));
//		 
//		 for(WebElement obj : objAllA) {
//			 
//		 } 
		
	}
	
	public static void newMthod() throws ArithmeticException,NullPointerException{
		
	}

}
