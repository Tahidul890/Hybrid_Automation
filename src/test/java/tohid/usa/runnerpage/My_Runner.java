package tohid.usa.runnerpage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"pretty","json:target/cucumber.json"},
		features = {".//Features/"},
		glue = {"tohid.usa.stepdefinition","tohid.usa.hooks"}
		
		)
public class My_Runner extends AbstractTestNGCucumberTests{

}
