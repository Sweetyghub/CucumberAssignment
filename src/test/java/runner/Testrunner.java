package runner;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",glue = {"stepDefinition/"}, tags="@Regression",
    plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
		)

public class Testrunner {

	
			
}
