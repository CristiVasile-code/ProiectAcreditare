package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //register
    @FindBy(id = "reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(id="reg_password")
    private WebElementFacade registerPassField;
    @FindBy(css = "[value=\"Register\"]")
    private WebElementFacade registerBtn;


    //login
    @FindBy(id="username")
    private WebElementFacade loginEmailField;
    @FindBy(id="password")
    private WebElementFacade loginPassField;
    @FindBy(css = "[value=\"Login\"]")
    private WebElementFacade loginBtn;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMsg;

    //Methods
    //register
    public void setRegisterEmailField(String email){
        typeInto(registerEmailField,email);
    }
    public void setRegisterPassField(String pass){typeInto(registerPassField,pass);}
    public void clickRegisterBtn(){clickOn(registerBtn);}
    //login
    public void setLoginEmailField(String email){
        typeInto(loginEmailField,email);
    }
    public void setLoginPassField(String pass){typeInto(loginPassField,pass);}
    public void clickLoginBtn(){clickOn(loginBtn);}
    public String getErrorMsg(){
        return errorMsg.getText();
    }
}
//TODO: un switch case cu mesajele de eroare