package CristiVasile.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
    public int formatStringToInt(String text){
        return Integer.parseInt(text.replaceAll("lei","").replaceAll(".00",""));
    }
}
