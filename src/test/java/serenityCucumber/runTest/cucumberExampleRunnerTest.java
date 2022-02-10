package serenityCucumber.runTest;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"serenityCucumber.firstProject.stepDefinitions"},
        features = "src/test/resources/features/Logging.feature")
public class cucumberExampleRunnerTest {


}
