package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{
    @Step
    public void removeItemsFromCart(int index){
        cartPage.removeItemX(index);
    }
    @Step
    public void clickOnCheckOutBtn(){
        cartPage.clickCheckoutBtn();
    }
    @Step
    public void isCartPage(){
        Assert.assertEquals("Cart",cartPage.getPageName());
    }
    @Step
    public boolean wasItemRemovedMsg(){
        return cartPage.getAlertMsg().contains("removed");
    }
    @Step
    public void wasItemRemoved(){
        Assert.assertTrue(wasItemRemovedMsg());
    }
    @Step
    public String wasCartUpdated(){
        return cartPage.getAlertMsg();

    }
    @Step
    public void isCartUpdated(){
        Assert.assertEquals("Cart updated.",wasCartUpdated());
    }
    @Step
    public void modifyQty(int qty){
        cartPage.setCartProductQty(String.valueOf(qty));
        waitABit(2000);
    }
    @Step
    public void clickOnUpdateCartBtn(){
        cartPage.clickUpdateCartBtn();
    }

}
