package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features", 
		glue = "glueCode",
		monochrome = true,
		tags = "@Sanity",
		plugin = {"html:target/report.html" }
		)

public class RunnerClass {

}