package glueCode;

import org.openqa.selenium.WebDriver;

import Execution.ExecuteFramework;
import FrameworkLibraries.FWLogger;
import FrameworkLibraries.ScenarioContext;
import io.cucumber.java.Scenario;

public class BaseStepDef {
	protected WebDriver driver;
	ScenarioContext sc = new ScenarioContext();
	
	enum Status{
		PASSED,
		FAILED
	}

	
	protected Scenario scenario;
	
	protected static FWLogger logger =  FWLogger.getLogger(WebApp.class.getName());
	
	public void wrtireLogAndResult(String msg) {
		logger.info(msg);
		scenario.log(msg);
		
	}
	
	protected void beforeStep(Scenario scenario) {
		this.scenario = scenario;

	}
	
	public void beforeHook() {
		System.out.println("Initlizing browser");
		ExecuteFramework execute = new ExecuteFramework("firefox");
		this.driver=execute.getWebDriver();
	}
	
	
	
	
//	protected void log(String strVal) {
//		System.out.println();t
//	}

	
	

}
