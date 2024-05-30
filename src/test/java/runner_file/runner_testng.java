package runner_file;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(dryRun = true, 
monochrome = true,
features = { "src/test/resources/feature_file" },
glue= { "file_step" }, 
plugin = { "pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json" },  tags = "@addtocart")

public class runner_testng  extends AbstractTestNGCucumberTests {
	
}