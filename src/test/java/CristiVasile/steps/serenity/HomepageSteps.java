package CristiVasile.steps.serenity;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
    @Step
    public void clickOnAddBtn(){homePage.clickAddBtn();
    waitABit(1000);
        System.out.println();}
    @Step
    public String getBtnText(){return homePage.getBtnText();}
    @Step
    public String getViewCartBtnTextC(){return homePage.getViewCartBtnCText();}
    @Step
    public void isTextChanged(){
        Assert.assertTrue(getViewCartBtnTextC().equalsIgnoreCase("View cart"));
    }
    @Step
    public void clickOnViewCartBtn(){
        homePage.clickViewCartBtn();
    }
}
