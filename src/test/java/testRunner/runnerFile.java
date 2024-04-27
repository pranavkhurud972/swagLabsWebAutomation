package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:Features",
		glue="stepdefs.stepDefinition",
		tags="",
		plugin = {"pretty",
				"html:target/html/htmlReport.html",
				"json:target/json/jsonReport.json",
		},
		monochrome=true,
		publish=true,
		dryRun= false
				
		)


public class runnerFile {

}
