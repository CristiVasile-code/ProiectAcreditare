package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;

public class HomepageSteps extends BaseSteps{
    @Step
    public void clickOnLoginLink(){
        homePage.clickLoginLink();
    }
    @Step
    public void clickOnLogoutBtn(){
        homePage.clickLogoutBtn();
    }
    @Step
    public void clickOnShopLink(){
        homePage.clickShopLink();
    }
    @Step
    public void navigateToShopPage(){
        clickOnLoginLink();
        clickOnShopLink();
    }
    @Step
    public void clickOnCartLink(){
        homePage.cartIconLink();
    }
    @Step
    public void typeIntoSearchBar(String text){
        homePage.typeInSearchBar(text);
    }
    @Step
    public void clickOnSearchBtn(){
        homePage.clickSearchBtn();
    }
    @Step
    public void clickOnHeaderCartBtn(){
        homePage.clickHeaderCartBtn();
    }
    @Step
    public void clickOnMyAccountBtn(){
        homePage.clickMyAccountBtn();
    }
}
