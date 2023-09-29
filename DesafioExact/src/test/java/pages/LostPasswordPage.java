package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LostPasswordPage extends BasePage{

    public LostPasswordPage(WebDriver driver) {
        super(driver);
    }


    //Mapping
    By userField = By.xpath("//input[@id='user_login']");
    By resetPasswordButton = By.xpath("//input[@value='Reset Password']");

    //Helper
    public boolean verifyMessage(String message){
        return returnIfTextDisplayed(message);
    }

    //Actions
    public void fillUser(String user){
        sendKeys(userField,user);
    }

    public void clickResetPassword(){
        click(resetPasswordButton);
    }

}
