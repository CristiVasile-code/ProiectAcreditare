package CristiVasile.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{
    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartBtn;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade productAddedMsg;
    @FindBy(css = ".entry-summary h1")
    private WebElementFacade productName;
    @FindBy(css = ".wc-products .inner-img")
    private List<WebElementFacade> listOfProducts;
    @FindBy(css = ".post-24 .inner-img a")
    private WebElementFacade productImg;
    @FindBy(css = ".quantity input")
    private WebElementFacade productQuantity;
    @FindBy(id="pa_color")
    private WebElementFacade colorSelector;
    @FindBy(id="pa_size")
    private WebElementFacade sizeSelector;
    @FindBy(css = "#tab-title-reviews a")
    private WebElementFacade reviewsTab;
    @FindBy(css = ".description p")
    private WebElementFacade reviewText;
    @FindBy(css = ".wc-forward")
    private WebElementFacade viewCartFromProductPage;
    @FindBy(css = ".woocommerce-product-details__short-description p")
    private WebElementFacade simpleProduct;
    // .woocommerce-product-details__short-description p - contine cuv simplu sau compus (cu contains)


    public String getProductAddedMsg(){
        waitFor(productAddedMsg);
        return formatString(productAddedMsg.getText());
    }
    public String getProductName(){
        return productName.getText();
    }
    public String formatString(String text){
        return text.replaceAll("View cart","")
                .replaceAll("“","\"").replaceAll("”","\"").trim();
    }
    public void clickProductImg(){
        clickOn(productImg);
    }//deprecated cred
    public void selectColor(int index){
        if(colorSelector.isDisplayed()){
        colorSelector.selectByIndex(index).click();}

    }
    public void selectSize(int index){
        if(sizeSelector.isDisplayed()){
        sizeSelector.selectByIndex(index).click();}
    }
    public void setProductQuantity(int quantity){
        waitFor(productQuantity);
        productQuantity.clear();
        typeInto(productQuantity,String.valueOf(quantity));
    }
    public void clickAddToCartBtn(){
        clickOn(addToCartBtn);
    }
    public WebElementFacade selectProduct(int index){
        waitFor(listOfProducts.get(0));
            return listOfProducts.get(index);
        }
    public void clickReviewsTab(){
        clickOn(reviewsTab);
    }
    public String getReviewText(){
        return reviewText.getText();
    }
    public void clickViewCartFromProdPage(){ // ar trebui un try catch pt cand nu este afisat butonul
        if(viewCartFromProductPage.isDisplayed()){
        clickOn(viewCartFromProductPage);}
    }
    public boolean isProductSimple(){
        return simpleProduct.getText().contains("variable");
    }
}
