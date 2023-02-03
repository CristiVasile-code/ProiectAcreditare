package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{
    @FindBy(css = ".collection_desc h3")
    private List<WebElementFacade> listOfProductNames;

    public boolean verify(String text){
//        waitFor(listOfProductNames.get(0));
        for(WebElementFacade element:listOfProductNames){
            if(element.getText().toLowerCase().contains(text)){
                return true;
            }
        }
        return false;

    }
//typeAndEnter(String)
}
