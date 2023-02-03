package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{
    @Step
    public void setFname(String fname){checkoutPage.setBillingFirstName(fname);}
    @Step
    public void setLname(String lname){checkoutPage.setBillingLastName(lname);}
    @Step
    public void setCountry(){checkoutPage.setBillingCountry();}
    @Step
    public void setAddress(String address){checkoutPage.setBillingAddress(address);}
    @Step
    public void setCity(String city){checkoutPage.setBillingCity(city);}
    @Step
    public void setPostcode(String postcode){checkoutPage.setBillingPostcode(postcode);}
    @Step
    public void setPhone(String phone){checkoutPage.setBillingPhone(phone);}
    @Step
    public void setEmail(String email){checkoutPage.setBillingEmail(email);}
    @Step
    public void clickOnPlaceOrderBtn(){checkoutPage.clickPlaceOrderBtn();}
    @Step
    public void doCheckOut(String fname, String lname, String address, String city, String postcode, String phone, String email){
        setFname(fname);
        setLname(lname);
        setCountry();
        setAddress(address);
        setCity(city);
        setPostcode(postcode);
        setPhone(phone);
        setEmail(email);
        clickOnPlaceOrderBtn();
    }
    @Step
    public void wasOrderReceived(){
        Assert.assertEquals("thank you. your order has been received.",checkoutPage.wasOrderReceived());
    }
    @Step
    public int getOrderNumber(){
        return Integer.parseInt(checkoutPage.getOrderNumber());
    }
}
