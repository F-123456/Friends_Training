package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabProductPage extends BasePage {
    public SwagLabProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//span[contains(text(),'Products')]")
    private WebElement productPageDisplayed;

    @FindBy(xpath = "//a[@id='item_4_title_link']")
    private WebElement clickOnBackPack;
    @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement clickOnAddtoCart;
    @FindBy(xpath ="//a[@class='shopping_cart_link']")
    private WebElement clickOnCart;
    @FindBy(xpath ="//button[@data-test='checkout']")
    private WebElement clickOnCheckout;



    public boolean IsProductPageDisplayed(){
        return productPageDisplayed.isDisplayed();
    }
    public void ClickOnBackPack(){
        clickOnBackPack.click();
    }
    public void ClickOnAddToCart(){
        clickOnAddtoCart.click();
    }
    public void ClickONCart(){
        clickOnCart.click();
    }
    public void CLickOnCheckout(){
        clickOnCheckout.click();
    }
}