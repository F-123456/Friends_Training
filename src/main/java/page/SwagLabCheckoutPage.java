package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabCheckoutPage extends BasePage {
    public SwagLabCheckoutPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@placeholder=\"First Name\"]")
    private WebElement firstNameLocator;
    @FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
    private WebElement lastNameLocator;
    @FindBy(xpath = "//input[@placeholder=\"Zip/Postal Code\"]")
    private WebElement zipCodeLocator;
    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement clickOnContinue;

    @FindBy(xpath = "//h3[@ data-test=\"error\"]")
    private WebElement errorMsg;

    @FindBy(xpath = "//h3[@ data-test=\"error\"]")
    private WebElement fNameErrorMsg;

    public void EnterFirstName() {
        firstNameLocator.sendKeys("Busayomi");
    }

    public void EnterLastName() {
        lastNameLocator.sendKeys("Kosh");
    }

    public void EnterZipCode() {
        zipCodeLocator.sendKeys("MK8 1AE");
    }

    public void ClickOnContinue() {
        clickOnContinue.click();
    }

    public String getMessage() {
        return errorMsg.getText();
    }

//public String getMessage(){
//  return fNameErrorMsg.getText();
}