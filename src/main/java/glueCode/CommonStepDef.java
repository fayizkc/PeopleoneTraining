package glueCode;

import org.joda.time.Seconds;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CommonStepDef {
	
	@Given("Open Application")
	
	@When("Wait for {int} seconds")
	public void hardWait(int time) {
		try {
			Thread.sleep(time*1000);
			System.out.println("Waiting for " + time + " Seconds");
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
	
	
	public void openApp() {
		System.out.println("Opening Applicaiont..");
	}
	
	@When ("Do actions")
	public void actions() {
		System.out.println("Actions...");
	}
	@Then ("Verify results")
	public void verifyResult() {
		System.out.println("Verifying");
	}
	
//	@Before (order=0)
//	public void beforeScenario() {
//		System.out.println("***Executing Scenario***");
//	}
//	
//	@After(order=0)
//	public void afterScenario() {
//		System.out.println("***Scenario DONE***");
//	}
	
	
	@Before ("@Regression and @DataDriven")
//	@Before (" @DataDriven")
	public void beforeScenario1() {
		System.out.println("***-1-Executing Scenario***");
	}
	
	@After("@Regression and @DataDriven")
//	@After("not @DataDriven")
	public void afterScenario1() {
		System.out.println("***-1-Scenario DONE***");
	}
	
	
	

}
