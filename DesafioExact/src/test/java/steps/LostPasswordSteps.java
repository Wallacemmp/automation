package steps;

import net.thucydides.core.annotations.Step;
import pages.LostPasswordPage;

public class LostPasswordSteps {
    LostPasswordPage lostPasswordPage;

    @Step("preencher o campo 'Username or email'")
    public void fillUser(String user){
        lostPasswordPage.fillUser(user);
    }

    @Step("clicar em 'RESET PASSWORD'")
    public void clickResetPassword(){
        lostPasswordPage.clickResetPassword();
    }

    @Step("verificar se mensagem foi retornada")
    public boolean verifyMessage(String message){
        return lostPasswordPage.verifyMessage(message);
    }
}
