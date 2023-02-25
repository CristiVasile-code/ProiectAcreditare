package CristiVasile.features.search;

import CristiVasile.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{
    @Test
    public void cartIconLinkTest(){
        homepageSteps.clickOnCartLink();
        cartSteps.isCartPage();
    }
    @Test
    public void headerCartBtnTest(){
        homepageSteps.clickOnHeaderCartBtn();
        cartSteps.isCartPage();
    }
    @Test
    public void cartBtnFromProdPageTest(){
        String text="shirt";
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(1,2);
        productSteps.goToCartFromProdPage();
        cartSteps.isCartPage();
    }
    @Test
    public void removeItemFromCart(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.clickOnShopLink();
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(1,2);
        productSteps.goToCartFromProdPage();
        cartSteps.removeItemsFromCart(0);
        cartSteps.wasItemRemoved();
    }
    @Test
    public void modifyQtyInCartPage(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(1,2);
        productSteps.goToCartFromProdPage();
        cartSteps.modifyQty(4);
        cartSteps.clickOnUpdateCartBtn();
        cartSteps.isCartUpdated();
    }
    @Test
    public void addCoupon(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(1,2);
        productSteps.goToCartFromProdPage();
        cartSteps.addCoupon(Constants.COUP_FS);
        cartSteps.wasCouponAdded();
    }
    @Test
    public void addCouponTotals(){
        String text="shirt";
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        productSteps.addProductToCart(2,2);
        productSteps.goToCartFromProdPage();
        cartSteps.addCoupon(Constants.COUP_FS);
        cartSteps.wasCouponAddedTotals();
    }
    @Test
    public void cartContentAfterLogout(){
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.clickOnCartLink();
        String[] exList = cartSteps.getProductArray(cartSteps.getProductList());
        homepageSteps.clickOnLogoutBtn();
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        homepageSteps.clickOnCartLink();
        String[] axList = cartSteps.getProductArray(cartSteps.getProductList());
        cartSteps.asses(exList,axList);
    }
}

