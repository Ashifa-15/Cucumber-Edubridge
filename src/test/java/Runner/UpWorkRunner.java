package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/main/java/Feature/upwork.feature"},
	publish=true,
	glue = {"UpWorkPack"},
	plugin = { "pretty", "html:target/cucumber-reports" },
    monochrome = false
    )
	
public class UpWorkRunner {

}
