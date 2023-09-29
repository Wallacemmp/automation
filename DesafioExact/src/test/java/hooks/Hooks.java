package hooks;

import cucumber.api.java.After;
import net.serenitybdd.core.Serenity;

public class Hooks {

    @After
    public void afterScenario(){
        //código a ser executado depois de cada cenário
        Serenity.clearCurrentSession();
        Serenity.getWebdriverManager().resetDriver();
        Serenity.getWebdriverManager().closeDriver();
    }
}
