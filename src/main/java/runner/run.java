package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/features/scipt.feature",
        glue="stepdefinition",
        plugin = "html:reports/beyoung.html",
        monochrome=true
)
public class run {
}
