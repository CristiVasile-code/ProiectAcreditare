package CristiVasile.features.search;

import org.junit.Test;

public class SearchTest extends BaseTest{
    @Test
    public void productSearchAndClickSearchIcon(){
        String text="shirt";
        homepageSteps.typeIntoSearchBar(text);
        homepageSteps.clickOnSearchBtn();
        searchSteps.wasSearchSuccesfull(text);
    }
    @Test
    public void productSearchAndEnter(){
        String text="shirt";
        searchSteps.typeEnterIntoSearchBar(text);
        searchSteps.wasSearchSuccesfull(text);

    }
}
