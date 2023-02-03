package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{
    @FindBy(id="billing_first_name")
    private WebElementFacade billingFirstName;
    @FindBy(id="billing_last_name")
    private WebElementFacade billingLastName;
    @FindBy(id="billing_country")
    private WebElementFacade billingCountry;
    @FindBy(css = "select2-selection select2-selection--single")
    private WebElementFacade country;//modifica
    @FindBy(css = ".select2-search__field")
    private WebElementFacade billingCountryField;
    @FindBy(id="billing_address_1")
    private WebElementFacade billingAddress;
    @FindBy(id="billing_city")
    private WebElementFacade billingCity;
    @FindBy(id="billing_postcode")
    private WebElementFacade billingPostcode;
    @FindBy(id="billing_phone")
    private WebElementFacade billingPhone;
    @FindBy(id="billing_email")
    private WebElementFacade billingEmail;
    @FindBy(id="place_order")
    private WebElementFacade placeOrderBtn;
    @FindBy(css = ".woocommerce-order p")
    private WebElementFacade thankYouMsg;
    @FindBy(css = ".woocommerce-order-overview__order strong")
    private WebElementFacade orderNumber;

    //Methods
    public void setBillingFirstName(String name){
        typeInto(billingFirstName,name);
    }
    public void setBillingLastName(String lname){
        typeInto(billingLastName,lname);
    }
    public void setBillingCountry(){
        billingCountry.selectByIndex(181);
    }
    public void setBillingAddress(String address) {typeInto(billingAddress, address);}
    public void setBillingCity(String city) {typeInto(billingCity, city);}
    public void setBillingPostcode(String postCode){typeInto(billingPostcode, postCode);}
    public void setBillingPhone(String phone){typeInto(billingPhone, phone);}
    public void setBillingEmail(String email){typeInto(billingEmail, email);}
    public void clickPlaceOrderBtn(){clickOn(placeOrderBtn);}
    public String wasOrderReceived(){
        waitFor(thankYouMsg);
        return thankYouMsg.getText().toLowerCase();
    }
    public String getOrderNumber(){
        waitFor(orderNumber);
        return orderNumber.getText();
    }


}
