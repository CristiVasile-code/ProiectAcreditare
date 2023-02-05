package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    //right-top navigation
    @FindBy(css = ".login-woocommerce a")
    private WebElementFacade loginLink;
    @FindBy(css = ".logout")
    private WebElementFacade logoutBtn;
    @FindBy(css = ".view-cart a")
    private WebElementFacade cartIconLink;
    @FindBy(css = ".search-field")
    private WebElementFacade searchField;
    @FindBy(css = ".search-form button")
    private WebElementFacade searchBtn;

    //left-top header with links
    @FindBy(css = "#menu-item-73 a")
    private WebElementFacade shopLink;
    @FindBy(css=".menu-item-72 a")
    private WebElementFacade headerCartBtn;
    @FindBy(css = ".menu-item-70 a")
    private WebElementFacade headerMyAccountBtn;


    //methods
    // right-top
    public void clickLoginLink(){
        clickOn(loginLink);
    }
    public void cartIconLink(){
        clickOn(cartIconLink);
    }
    public void typeInSearchBar(String text){
        typeInto(searchField,text);
    }
    public void typeInSearchBarAndEnter(String text){searchField.typeAndEnter(text);}
    public void clickSearchBtn(){
        clickOn(searchBtn);
    }
    public void clickLogoutBtn(){
        clickOn(logoutBtn);
    }
    //left-top
    public void clickShopLink(){
        clickOn(shopLink);
    }
    public void clickHeaderCartBtn(){
        clickOn(headerCartBtn);
    }
    public void clickMyAccountBtn(){
        waitFor(headerMyAccountBtn);
        clickOn(headerMyAccountBtn);
    }
}
