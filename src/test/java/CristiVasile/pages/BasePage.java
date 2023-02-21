package CristiVasile.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
    public float formatStringToInt(String text){
        return Float.parseFloat(text.replaceAll("lei","").replaceAll(".00",""));
    }
}
