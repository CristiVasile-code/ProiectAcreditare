package CristiVasile.features.search;

import CristiVasile.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{
    @Test
    public void addToCart(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.clickOnShopLink();
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(1,2);
        productSteps.wasProductAdded();
    }
    @Test
    public void reviews(){
        String text="beanie";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.clickOnShopLink();
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.selectProduct(1);
        productSteps.clickOnReviewsTab();
        productSteps.isReviewVisible();

    }
    @Test
    public void smokeTest(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(2,2);
        homepageSteps.clickOnCartLink();
        cartSteps.clickOnCheckOutBtn();
        checkoutSteps.doCheckOut(Constants.BILL_FNAME, Constants.BILL_LNAME, Constants.BILL_ADDRESS, Constants.BILL_CITY, Constants.BILL_POSTCODE, Constants.BILL_PHONE, Constants.REG_EMAIL);
        checkoutSteps.wasOrderReceived();
    }
}
