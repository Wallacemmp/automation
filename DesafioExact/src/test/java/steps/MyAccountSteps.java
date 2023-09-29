package steps;

import net.thucydides.core.annotations.Step;
import pages.MyAccountPage;

public class MyAccountSteps {

    MyAccountPage myAccountPage;

    @Step("verificar se usuário foi retornado")
    public boolean checkUser(String user){
        return myAccountPage.checkUser(user);
    }
}
