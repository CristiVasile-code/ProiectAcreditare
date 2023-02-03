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
//        waitFor(alertMsg);
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


}
