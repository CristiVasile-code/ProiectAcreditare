package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

public class LoginSteps extends BaseSteps{
    @Step
    public void typeIntoRegEmailField(String email){
        loginPage.setRegisterEmailField(email);
    }
    @Step
    public void typeIntoRegPassField(String pass){
        loginPage.setRegisterPassField(pass);
    }
    @Step
    public void clickOnRegBtn(){loginPage.clickRegisterBtn();}
    @Step
    public void doRegister(String email, String pass){
        typeIntoRegEmailField(email);
        typeIntoRegPassField(pass);
        clickOnRegBtn();
    }
    @Step
    public void typeIntoLoginEmailField(String email){
        loginPage.setLoginEmailField(email);
    }
    @Step
    public void typeIntoLoginPassField(String pass){
        loginPage.setLoginPassField(pass);
    }
    @Step
    public void clickOnLoginBtn(){
        loginPage.clickLoginBtn();
    }
    @Step
    public void doLogin(String email, String pass){
        typeIntoLoginEmailField(email);
        typeIntoLoginPassField(pass);
        clickOnLoginBtn();
    }
    @Step
    public void isUserNameReqMsgDisplayed(){
        Assert.assertEquals("Error: Username is required.", loginPage.getErrorMsg());
    }
    @Step
    public void isPassMissingMsgDisplayed(){
        Assert.assertEquals("ERROR: The password field is empty.",loginPage.getErrorMsg());
    }
    @Step
    public void isWrongPassMsgDisplayed(){
        Assert.assertEquals("ERROR: The password you entered for the email address cristivasilecode@gmail.com is incorrect. Lost your password?", loginPage.getErrorMsg());
    }
    @Step
    public void isWrongUserMsgDisplayed(){
        Assert.assertEquals("ERROR: Invalid username. Lost your password?", loginPage.getErrorMsg());
    }

}
