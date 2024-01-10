package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabCompletePage extends BasePage {
    public SwagLabCompletePage(WebDriver driver) {
        super(driver);
    }



    //    @FindBy(xpath ="//h2[contains(text(),'Thank you for your order!')]")
    @FindBy(xpath ="//h2[@class='complete-header']")
    private WebElement thankYouLocator;


//    public boolean IsThankYouPageVisble() {
//        return thankYouLocator.isDisplayed();
//    }

    public String getMessage() {
        return thankYouLocator.getText();
    }
}