package CristiVasile.features.search;

import CristiVasile.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest{
    @Test
    public void orderExists(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(2,2);
        homepageSteps.clickOnCartLink();
        cartSteps.clickOnCheckOutBtn();
        checkoutSteps.doCheckOut(Constants.BILL_FNAME, Constants.BILL_LNAME, Constants.BILL_ADDRESS, Constants.BILL_CITY, Constants.BILL_POSTCODE, Constants.BILL_PHONE, Constants.REG_EMAIL);
        int number = checkoutSteps.getOrderNumber();
        homepageSteps.clickOnMyAccountBtn();
        accountSteps.clickOnOrdersBtn();
        accountSteps.isOrder(number);
    }

}
