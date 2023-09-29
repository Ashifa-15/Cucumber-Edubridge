package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/main/java/Feature/Checking.feature"},
	publish=true,
	glue = {"stepDefinition"},
    //plugin = { "pretty" },
    //plugin = { "usage" },
    plugin = { "pretty", "html:target/cucumber-reports" },
	monochrome = true
		)

public class CucuRuntest {

}
