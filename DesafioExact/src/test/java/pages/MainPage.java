package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    //Mapping

    //Actions
    public void clickByText(String text){
        super.clickByText(text);
    }

}
