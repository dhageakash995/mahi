package cucumberOptions;

  
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
			features ="src/test/java/feature",
			glue= {"stepDefinations" },tags=" @portalTest",monochrome=true,dryRun=true,
					//glue is just a parameter will define stepDefination file
			//dryRun=true
			plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"}
			
			)
	public class TestRunner {
}
