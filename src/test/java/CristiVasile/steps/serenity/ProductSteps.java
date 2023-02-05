package CristiVasile.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductSteps extends BaseSteps{
    @Step
    public void clickOnAddToCartBtn(){
        productPage.clickAddToCartBtn();
    }
    @Step
    public String getProductName(){
       return productPage.getProductName();
    }
    @Step
    public String getProductWasAddedMsg(){
        return productPage.getProductAddedMsg();
    }
    @Step
    public void clickOnProductImg(){
        productPage.clickProductImg();
    }
    @Step
    public void selectProdFromSearch(int index){
        selectProduct(index);
    }
    @Step
    public void addProductToCart(int index, int quantity){
        selectProduct(index);
        if(isProductSimple()){
            selectProductColor(1);
            selectProductSize(1);}
        selectQuantity(quantity);
        clickOnAddToCartBtn();
    }
    @Step
    public void wasProductAdded(){
        System.out.println("\""+getProductName()+"\""+" has been added to your cart.");
        System.out.println(getProductWasAddedMsg());
        Assert.assertEquals("\""+getProductName()+"\""+" has been added to your cart.",getProductWasAddedMsg());
    }
    @Step
    public void selectProduct(int index){
        productPage.selectProduct(index).click();
    }
    @Step
    public void selectQuantity(int quantity){
        productPage.setProductQuantity(quantity);
    }
    @Step
    public void selectProductColor(int index){
        productPage.selectColor(index);
    }
    @Step
    public void selectProductSize(int index){
        productPage.selectSize(index);
    }
    @Step
    public void clickOnReviewsTab(){
        productPage.clickReviewsTab();
    }
    @Step
    public String getReviewText(){
        return productPage.getReviewText();
    }
    @Step
    public void isReviewVisible(){
        Assert.assertEquals("bla",getReviewText().toLowerCase());
    }
    @Step
    public void goToCartFromProdPage(){
        productPage.clickViewCartFromProdPage();
    }
    @Step
    public boolean isProductSimple(){
        return productPage.isProductSimple();
    }
    @Step
    public void isImgDisplayed(){

        Assert.assertFalse("Imaginea nu e afisata !",prodImgContent());
    }
    @Step
    public boolean prodImgContent(){
        return productPage.prodImgCont().toLowerCase().contains("awaiting");
    }
    @Step
    public void clickOnAdInfoBtn(){
        productPage.clickAdditionalInfoBtn();
    }
    @Step
    public void clickOnReviewsBtn(){
        productPage.clickReviewsBtn();
    }
    @Step
    public void isAdditionalTab(){
        Assert.assertEquals("Additional information",productPage.getAdditTitle());
    }
    @Step
    public void isReviewsTab(){
        Assert.assertEquals("Reviews",productPage.getReviewsTitle());
    }
}
