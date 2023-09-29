package steps;


import net.thucydides.core.annotations.Step;
import pages.MainPage;

public class MainSteps {
    MainPage mainPage;

    @Step("clicar em '{0}'")
    public void clickByText(String text){
        mainPage.clickByText(text);
    }



}
