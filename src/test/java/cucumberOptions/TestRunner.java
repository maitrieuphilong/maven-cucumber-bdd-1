package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = { "pretty", "html:target/site/cucumber-report-default.html", "json:target/site/cucumber.json" },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@datatable_step"
)
public class TestRunner {

}
