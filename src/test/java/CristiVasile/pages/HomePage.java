package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(css = ".login-woocommerce a")
    private WebElementFacade loginBtn;
    public void clickLoginBtn(){
        clickOn(loginBtn);
    }
}
