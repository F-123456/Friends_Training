package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaNationalityPage extends BasePage {
    public UkbaNationalityPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id= "response")
    private WebElement EnterCountryNameLocator;

    @FindBy (xpath ="//button[contains(text(),'Continue')]")
    private WebElement ClickOnContinueLocator;



    public void EnterCountryName(String cName){
        EnterCountryNameLocator.sendKeys(cName);
    }
    public void ClickOnContinue(){
        ClickOnContinueLocator.click();
    }
}