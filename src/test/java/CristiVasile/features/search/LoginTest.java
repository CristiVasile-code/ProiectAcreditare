package CristiVasile.features.search;

import CristiVasile.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginWithValidCredentials(){
        homepageSteps.clickOnLoginLink();
        loginSteps.doLogin(Constants.REG_EMAIL, Constants.REG_PASS);
        accountSteps.isUserLoggedIn();
    }
    @Test
    public void loginWithMissingEmail(){
        homepageSteps.clickOnLoginLink();
        loginSteps.typeIntoLoginPassField(Constants.REG_PASS);
        loginSteps.clickOnLoginBtn();
        loginSteps.isUserNameReqMsgDisplayed();
        //TODO: un switch case cu mesajele de eroare
    }
    @Test
    public void loginWithMissingPass(){
        homepageSteps.clickOnLoginLink();
        loginSteps.typeIntoLoginEmailField(Constants.REG_EMAIL);
        loginSteps.clickOnLoginBtn();
        loginSteps.isPassMissingMsgDisplayed();
    }
    @Test
    public void loginWithWrongPass(){
        homepageSteps.clickOnLoginLink();
        loginSteps.typeIntoLoginEmailField(Constants.REG_EMAIL);
        loginSteps.typeIntoLoginPassField("123456");
        loginSteps.clickOnLoginBtn();
        loginSteps.isWrongPassMsgDisplayed();
    }
    @Test
    public void loginWithWrongUser(){
        homepageSteps.clickOnLoginLink();
        loginSteps.typeIntoLoginEmailField("dorel");
        loginSteps.typeIntoLoginPassField(Constants.REG_PASS);
        loginSteps.clickOnLoginBtn();
        loginSteps.isWrongUserMsgDisplayed();
    }
    @Test
    public void register(){
        homepageSteps.clickOnLoginLink();
        loginSteps.doRegister(Constants.REG_EMAIL, Constants.REG_PASS);
    }
}
