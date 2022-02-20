package qa.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"qa.steps"},
        monochrome = true,
        tags = "@test",
        plugin = {"pretty","html:target/cucumber/report.html","json:target/cucumber/report.json"}
)

public class TestRunner {}