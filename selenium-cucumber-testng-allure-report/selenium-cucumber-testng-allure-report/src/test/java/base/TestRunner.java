package base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"step_definitions"},
//        plugin = {"pretty", "html:target/report/cucumber-report.html", "json:cucumber.json"}
     plugin = {"pretty","html:target/cucumber-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
