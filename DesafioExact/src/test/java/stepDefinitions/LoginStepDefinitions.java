package stepDefinitions;

import cucumber.api.java.en.When;
import types.Users;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

import java.io.IOException;

public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    Users users = Users.get("src/test/resources/jsons/Users.json");

    public LoginStepDefinitions() throws IOException {
    }


    //Helper
    @Given("estou na página inicial")
    public void openSite(){
        loginSteps.openSite();
    }

    @And("preencho 'email' e 'senha'")
    public void fillCredentials(){
        loginSteps.fillCredentials(users.getEmail(), users.getPassword());
    }

    @When("clico em LOGIN")
    public void clickLogin(){
        loginSteps.clickLogin();
    }

    @And("preencho 'email' e 'senha' de cadastro")
    public void fillRegister(){
        loginSteps.fillUserReg(users.getEmailReg());
        loginSteps.fillPasswordReg(users.getPasswordReg());
    }

    @When("clico em REGISTER")
    public void clickRegister(){
        loginSteps.clickEmailRegField();
        loginSteps.clickRegister();
    }
}
