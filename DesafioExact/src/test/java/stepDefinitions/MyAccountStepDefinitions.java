package stepDefinitions;


import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.MyAccountSteps;
import types.Users;

import java.io.IOException;

public class MyAccountStepDefinitions {

    @Steps
    MyAccountSteps myAccountSteps;

    Users users = Users.get("src/test/resources/jsons/Users.json");

    public MyAccountStepDefinitions() throws IOException {
    }

    @Then("a mensagem de 'Hello usuário' deve ser exibida")
    public void checkUser(){
        Assert.assertTrue(myAccountSteps.checkUser(users.getUser()));
    }

    @Then("a mensagem de cadastro 'Hello usuário' deve ser exibida")
    public void checkUserReg(){
        Assert.assertTrue(myAccountSteps.checkUser(users.getUserReg()));
    }
}
