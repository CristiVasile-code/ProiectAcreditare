package CristiVasile.steps.serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import java.util.List;

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
    @Step
    public void setCouponField(String text){
        cartPage.setCouponField(text);
    }
    @Step
    public void clickOnCouponBtn(){
        cartPage.clickCouponBtn();
    }
    @Step
    public void addCoupon(String text){
        setCouponField(text);
        clickOnCouponBtn();
    }
    @Step
    public boolean hasCoupon(){
        return cartPage.getCouponText().toLowerCase().contains("coupon");
    }
    @Step
    public void wasCouponAdded(){
        Assert.assertTrue("Coupon was not added.",hasCoupon());
    }
    @Step
    public float getSubtotal(){
        return cartPage.getOrderSubtotal();
    }
    @Step
    public float getOrderTotal(){
        return cartPage.getOrderTotal();
    }
    @Step
    public void wasCouponAddedTotals(){
        waitABit(2000);
        Assert.assertTrue("Coupon was not added.",getOrderTotal()==getSubtotal());
        System.out.println(getOrderTotal() +" "+ getSubtotal());
    }
    @Step
    public List<WebElementFacade> getProductList(){
        return cartPage.cartItems();
    }
    @Step
    public String[] getProductArray(List<WebElementFacade> list){
        String[] sList = new String[list.size()];
        for(int i=0;i<list.size();i++)
            sList[i] += list.get(i).getText();
        return sList;
    }
    @Step
    public void asses(String[] axList, String[] exList){
        Assert.assertArrayEquals(axList, exList);
    }
}
