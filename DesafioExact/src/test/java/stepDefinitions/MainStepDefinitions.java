package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.LostPasswordSteps;
import steps.MainSteps;

public class MainStepDefinitions {

    @Steps
    MainSteps mainSteps;

    @Steps
    LostPasswordSteps lostPasswordSteps;

    @When("clico em '(.*)'")
    public void clickByText(String text){
        mainSteps.clickByText(text);
    }



}
