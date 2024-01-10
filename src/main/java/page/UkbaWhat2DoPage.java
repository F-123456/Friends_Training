package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaWhat2DoPage extends BasePage {
    public UkbaWhat2DoPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(id = "response-2")
    private WebElement clickOnStudyLocator;

    @FindBy (id="response-0")
    private WebElement clickOnTourismLocator;


    public void ClickOnStudyButton(){
        clickOnStudyLocator.click();
    }
    public void ClickOnTourismButton(){
        clickOnTourismLocator.click();
    }

}