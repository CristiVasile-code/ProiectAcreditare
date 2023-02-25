package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends BasePage{
    @FindBy(css = ".woocommerce-MyAccount-content strong:nth-child(1)")
    private WebElementFacade welcomeMsgUser;
    @FindBy(css = ".woocommerce-MyAccount-navigation-link--orders a")
    private WebElementFacade ordersBtn;
    @FindBy(css = ".woocommerce-orders-table__cell-order-number")
    private List<WebElementFacade> listOrderNumbers;

    public String getWelcomeMsgUser(){
        waitFor(welcomeMsgUser);
        return welcomeMsgUser.getText();
    }
    public void clickOrdersBtn(){
        clickOn(ordersBtn);
    }
    public boolean isOrderNumberInList(int number){
        waitFor(listOrderNumbers.get(0));
        for(WebElementFacade element:listOrderNumbers){
            if(Integer.parseInt(element.getText().replaceAll("#","")) == number){
                return true;
            }
        }
        return false;
    }
}
