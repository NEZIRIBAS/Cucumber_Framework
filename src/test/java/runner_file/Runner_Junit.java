package runner_file;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, 
monochrome = true,
features = {"src/test/resources/feature_file"},
glue= {"file_step"},
plugin= {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"})


public class Runner_Junit {

}
