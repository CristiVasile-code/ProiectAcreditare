package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;

public class HomepageSteps extends BaseSteps{
    @Step
    public void clickOnLoginBtn(){
        homePage.clickLoginBtn();
    }
}
