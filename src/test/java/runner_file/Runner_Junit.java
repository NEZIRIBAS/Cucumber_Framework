package runner_file;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, 
monochrome = true,
publish = true,
features = {"src/test/resources/feature_file"},
glue= {"file_step"},
plugin= {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Runner_Junit {

}
