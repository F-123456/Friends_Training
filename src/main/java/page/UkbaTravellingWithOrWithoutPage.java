package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaTravellingWithOrWithoutPage extends BasePage {
    public UkbaTravellingWithOrWithoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="response-0")
    private WebElement clickOnVistingPartnerLocator;


    public void ClickOnVistingPartner(){
        clickOnVistingPartnerLocator.click();
    }
}