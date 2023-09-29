package test;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"classpath:steps",
                "classpath:stepdefinitions",
                "classpath:test",
                "classpath:pages"})

public class TestExact {
}
