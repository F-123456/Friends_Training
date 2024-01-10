package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaConfirmationPage extends BasePage {
    public UkbaConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to study in the UK')]")
    private WebElement VisaNeededLocator;

    @FindBy(xpath = "//h2[contains(text(),'You’ll usually need a visa to come to the UK')]")
    private WebElement YouNeedAVisaLocator;


    public boolean YouNeedaVisaToStudyIsDIsplayed(){
        return VisaNeededLocator.isDisplayed();
    }
    public boolean YouNeedAVisaDisplayed(){
        return YouNeedAVisaLocator.isDisplayed();
    }
}