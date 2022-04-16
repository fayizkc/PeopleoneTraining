package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features", 
		glue = "glueCode",
//		monochrome = true,
		tags = "@Test1",
		plugin = {"json:target/json/report.json" }
		)

public class RunnerClass {

}
