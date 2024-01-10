package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegistrationPage extends BasePage {
    public NewtoursRegistrationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    private WebElement EnterFirstNameLocator;
    @FindBy(xpath = "//input[@name=\"lastName\"]")
    private WebElement EnterLastNameLocator;
    @FindBy(id="userName")
    private WebElement EnterEmailLocator;
    @FindBy(xpath ="//input[@name=\"phone\"]")
    private WebElement EnterPhoneNumber;
    @FindBy(xpath = "//input[@name=\"address1\"]")
    private WebElement EnterAddress;
    @FindBy(xpath = "//input[@name=\"city\"]")
    private WebElement EnterCity;
    @FindBy(xpath = "//input[@name=\"state\"]")
    private WebElement EnterState;
    @FindBy(xpath = "//input[@name=\"postalCode\"]")
    private WebElement EnterPostalCode;
    @FindBy(xpath = "//select[@name=\"country\"]")
    private WebElement SelectCountry;
    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement EnterUserName;
    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement EnterPassword;
    @FindBy(xpath = "//input[@name=\"confirmPassword\"]")
    private WebElement EnterConfirmPWrd;
    @FindBy(xpath = "//input[@name=\"submit\"]")
    private WebElement ClickOnSubmit;

    @FindBy(xpath = "//b[contains(text(),'user')]")
    private WebElement NoteElement;


    public void enterFirstName(String fName){
        EnterFirstNameLocator.sendKeys(fName);
    }
    public void enterLastName(String lName){
        EnterLastNameLocator.sendKeys(lName);
    }
    public void enterEmailAdd(String eAdd){
        EnterEmailLocator.sendKeys(eAdd);
    }
    public void enterPhoneNumber(String pNum){
        EnterPhoneNumber.sendKeys(pNum);
    }
    public void enterAddress(String aDd){
        EnterAddress.sendKeys(aDd);
    }
    public void enterCity(String cIty){
        EnterCity.sendKeys(cIty);
    }
    public void enterState(String sTate){
        EnterState.sendKeys(sTate);
    }
    public void enterPostalCode(String pCode){
        EnterPostalCode.sendKeys(pCode);
    }
    public void selectCountry(){
        SelectCountry.isSelected();

//    public void selectByVisibleText(){
//        Select select = new Select(EnterCountry);
//        select.selectByVisibleText("IRELAND");
    }
    public void enterUserName(String uName){
        EnterUserName.sendKeys(uName);
    }
    public void enterPassword(String pWrd){
        EnterPassword.sendKeys(pWrd);
    }
    public void enterConfirmPwrd(String cPwrd){
        EnterConfirmPWrd.sendKeys(cPwrd);
    }
    public void clickOnSubmit(){
        ClickOnSubmit.click();
    }
    public boolean iSNoteElementDisplayed(){
        return NoteElement.isDisplayed();
    }
}