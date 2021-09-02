 package Testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinations",
		tags = {"@smoketest"},
		plugin="html:target/cucumber-html-report")
public class testrunner extends AbstractTestNGCucumberTests{
	 
}
	

