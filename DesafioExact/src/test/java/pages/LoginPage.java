package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Helper
    public void openSite(){
        openUrl("https://practice.automationtesting.in");
    }

    //Mapping
    By userNameField = By.xpath("//input[@id='username']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@value='Login']");
    By emailRegField = By.xpath("//input[@id='reg_email']");
    By passwordRegField = By.xpath("//input[@id='reg_password']");
    By registerButton = By.xpath("//input[@value='Register']");

    //Actions
    public void fillUser(String text){
        sendKeys(userNameField,text);
    }

    public void fillPassword(String text){
        sendKeys(passwordField,text);
    }

    public void clickLogin(){
        click(loginButton);
    }

    public void fillUserReg(String text){
        sendKeys(emailRegField,text);
    }

    public void fillPasswordReg(String text){
        sendKeys(passwordRegField,text);
    }

    public void clickRegister(){
        click(registerButton);
    }

    public void clickEmailRegField(){
        waitABit(2000);
        click(emailRegField);
    }
}
