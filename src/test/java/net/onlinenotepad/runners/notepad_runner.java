package net.onlinenotepad.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/my-devco-feature.feature",
        glue = "net.onlinenotepad.stepdefinitions",
        tags = "@user"
)
public class notepad_runner {
}
