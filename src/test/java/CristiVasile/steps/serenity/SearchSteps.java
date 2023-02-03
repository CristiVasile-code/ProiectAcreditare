package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{
    @Step
    public void typeEnterIntoSearchBar(String text){homePage.typeInSearchBarAndEnter(text);
    waitABit(2000);}
    @Step
    public void wasSearchSuccesfull(String text){

        Assert.assertTrue("The product is not present",searchPage.verify(text));
    }

}
