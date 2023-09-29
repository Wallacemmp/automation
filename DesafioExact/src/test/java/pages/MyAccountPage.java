package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    //Mapping
    By userNameText = By.xpath("//div[@class='woocommerce-MyAccount-content']//strong");
    //Actions
    public boolean checkUser(String user){
        return super.returnIfTextDisplayed(user);
    }
}
