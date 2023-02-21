package CristiVasile.features.search;

import org.junit.Test;

public class HomepageTest extends BaseTest{
    @Test
    public void btnChange(){
        homepageSteps.clickOnShopLink();
        homepageSteps.clickOnAddBtn();
        homepageSteps.isTextChanged();
    }
    @Test
    public void cartPageFromShopPage(){
        homepageSteps.clickOnShopLink();
        homepageSteps.clickOnAddBtn();
        homepageSteps.clickOnViewCartBtn();
        cartSteps.isCartPage();
    }
}
