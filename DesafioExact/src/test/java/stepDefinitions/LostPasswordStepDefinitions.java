package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.LostPasswordSteps;
import types.Users;

import java.io.IOException;

public class LostPasswordStepDefinitions {
    @Steps
    LostPasswordSteps lostPasswordSteps;

    Users users = Users.get("src/test/resources/jsons/Users.json");

    public LostPasswordStepDefinitions() throws IOException {
    }

    @And("preencho o campo 'Username or email'")
    public void fillUser(){
        lostPasswordSteps.fillUser(users.getUser());
    }

    @When("clico em RESET PASSWORD")
    public void clickResetPassword(){
        lostPasswordSteps.clickResetPassword();
    }

    @Then("a mensagem '(.*)' deve ser exibida")
    public void verifyMessage(String message){
        Assert.assertTrue(lostPasswordSteps.verifyMessage(message));
    }
}
