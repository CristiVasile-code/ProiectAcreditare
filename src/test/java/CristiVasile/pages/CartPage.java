package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutBtn;
    @FindBy(css = ".product-remove a")
    private List<WebElementFacade> listOfRemoveBtns;
    @FindBy(css = ".cart-empty")
    private WebElementFacade cartEmptyMsg;
    @FindBy(css = ".return-to-shop a")
    private WebElementFacade returnToShopBtn;
    @FindBy(css = ".current")
    private WebElementFacade pageName;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade alertMsg;
    @FindBy(css = ".qty")
    private List<WebElementFacade> listCartProductQty;
    @FindBy(css = "[name=\"update_cart\"]")
    private WebElementFacade updateCartBtn;
    @FindBy(id="coupon_code")
    private WebElementFacade couponField;
    @FindBy(css = ".coupon .button")
    private WebElementFacade couponBtn;
    @FindBy(css = ".cart-discount th")
    private WebElementFacade coupon;
    @FindBy(css = ".cart-subtotal .amount")
    private WebElementFacade orderSubtotal;
    @FindBy(css = ".order-total .amount")
    private WebElementFacade orderTotal;
    @FindBy(css = "[data-title=\"Product\"]")
    private List<WebElementFacade> listOfProducts;

//    methods
    public void clickCheckoutBtn(){
        clickOn(checkoutBtn);
    }
    public void clickReturnToShopBtn(){
        clickOn(returnToShopBtn);
    }
    public boolean isCartEmpty(){
        return cartEmptyMsg.isDisplayed();
    }
    public void removeItemX(int index){ //TODO: de implementat un try catch pt cand este cartul gol
            waitFor(listOfRemoveBtns.get(0));
            listOfRemoveBtns.get(index).click();
    }
    public String getPageName(){
        return pageName.getText();
    }
    public String getAlertMsg(){
        waitFor(alertMsg);
        return alertMsg.getText();
    }
    public void setCartProductQty(String qty){
        waitFor(listCartProductQty.get(0));
        int productsNr = listCartProductQty.size();
        WebElementFacade lastItem = listCartProductQty.get(productsNr-1);
        lastItem.clear();
        typeInto(lastItem, qty);
    }
    public void clickUpdateCartBtn(){
        clickOn(updateCartBtn);
        waitABit(1000);
    }
    public void setCouponField(String text){
        waitFor(couponField);
        typeInto(couponField, text);
    }
    public void clickCouponBtn(){
        clickOn(couponBtn);
    }
    public String getCouponText(){
        return coupon.getText();
    }
    public float getOrderSubtotal(){
        waitFor(orderSubtotal);
        return formatStringToInt(orderSubtotal.getText());
    }
    public float getOrderTotal(){
        waitFor(orderTotal);
        return formatStringToInt(orderTotal.getText());
    }
    public List<WebElementFacade> cartItems(){
        waitFor(listOfProducts.get(0));
        return listOfProducts;
    }

}
