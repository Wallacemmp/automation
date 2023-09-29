package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    @Step("Acessar o site")
    public void openSite(){
        loginPage.openSite();
    }

    @Step("preencher usuáro e senha")
    public void fillCredentials(String user, String password){
        loginPage.fillUser(user);
        loginPage.fillPassword(password);
    }

    @Step("clicar em LOGIN")
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Step("preencher o campo Email address")
    public void fillUserReg(String user){
        loginPage.fillUserReg(user);
    }

    @Step("preencher o campo password")
    public void fillPasswordReg(String password){
        loginPage.fillPasswordReg(password);
    }

    @Step("clicar em REGISTER")
    public void clickRegister(){
        loginPage.clickRegister();
    }

    @Step("clicar no campo email de cadastro")
    public void clickEmailRegField(){
        loginPage.clickEmailRegField();
    }
}
