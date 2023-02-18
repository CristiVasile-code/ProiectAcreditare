package CristiVasile.steps.serenity;

import CristiVasile.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountSteps extends BaseSteps{
    @Step
    public String getWelcomeText(){
        return accountPage.getWelcomeMsgUser();
    }
    @Step
    public void isUserLoggedIn(){
        Assert.assertEquals(Constants.USER_NAME,getWelcomeText());
    }
    @Step
    public void clickOnOrdersBtn(){
        accountPage.clickOrdersBtn();
    }
    @Step
    public void isOrder(int number){
        Assert.assertTrue(accountPage.isOrderNumberInList(number));
    }
}
