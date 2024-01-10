package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AutoExercisesInfoPage extends BasePage{

    public AutoExercisesInfoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
//    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    private WebElement accountInfoPageIsVisible;
    @FindBy(id = "id_gender1")
    private WebElement clickOnGenderLocator;
    @FindBy(id = "password")
    private WebElement enterPasswordLocator;
    @FindBy(id = "days")
    private WebElement enterDayOfBirthLocator;
    @FindBy(id = "months")
    private WebElement enterMonthOfBirthLocator;
    @FindBy(id= "years")
    private WebElement enterYearOfBirthLocator;
    @FindBy(id = "newsletter")
    private WebElement clickOnSignUpNLetterLocator;
    @FindBy(id = "optin")
    private WebElement clickOnReceiveOfferLocator;
    @FindBy(id = "first_name")
    private WebElement enterFirstNameLocator;
    @FindBy(id= "last_name")
    private WebElement enterLastNameLocator;
    @FindBy(id = "company")
    private WebElement enterCompanyNameLocator;
    @FindBy(id = "address1")
    private WebElement enterAddress1Locator;
    @FindBy(id = "country")
    private WebElement enterCountryLocator;
    @FindBy(id= "state")
    private WebElement enterStateLocator;
    @FindBy(id = "city")
    private WebElement enterCityLocator;
    @FindBy(id = "zipcode")
    private WebElement enterZipCodeLocator;
    @FindBy(id = "mobile_number")
    private WebElement enterMobileNumLocator;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    //private List<WebElement> clickOnCreateAcctLocator;
    private WebElement clickOnCreateAcctLocator;
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    private WebElement accountCreatedIsDisplayed;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    private WebElement clickOnContinueLocator;




    public boolean IsAccountInfoPageVisble() {
        return accountInfoPageIsVisible.isDisplayed();
    }

    public void clickOnGenderButton() {
        clickOnGenderLocator.click();
    }
    public void enterPassword(String pWord){
        enterPasswordLocator.sendKeys(pWord);
    }
    public void enterDayofBirth(){
        enterDayOfBirthLocator.sendKeys("15");
    }
    public void enterMonthOfBirth(){
        enterMonthOfBirthLocator.sendKeys("02");
    }
    public void enterYearOfBirth(){
        enterYearOfBirthLocator.sendKeys("1990");
    }
    public void clickOnSignUpLettersButton(){
        clickOnSignUpNLetterLocator.click();

    }
    public void clickOnReceiveOfferButton(){
        clickOnReceiveOfferLocator.click();
    }
    public void enterFirstName(String fName){
        enterFirstNameLocator.sendKeys(fName);
    }
    public void enterLastName(String lName){
        enterLastNameLocator.sendKeys(lName);
    }
    public void enterCompanyName(String coyName){
        enterCompanyNameLocator.sendKeys(coyName);
    }
    public void EnterAddress(String addre){
        enterAddress1Locator.sendKeys(addre);
    }
    public void EnterCountryName(String countryName){
        enterCountryLocator.sendKeys(countryName);
    }
    public void EnterStateName(String staNmae){
        enterStateLocator.sendKeys(staNmae);
    }
    public void EnterCityName(String citNmae){
        enterCityLocator.sendKeys(citNmae);
    }
    public void EnterZipCodeNum(String zipCde){
        enterZipCodeLocator.sendKeys(zipCde);
    }
    public void EnterMobileNum(String num){
        enterMobileNumLocator.sendKeys(num);
    }
    public void ClickOnCreateAccButton(){
        //clickOnCreateAcctLocator.get(0).click();
        clickOnCreateAcctLocator.click();
    }
    public boolean AccountCreatedIsDispalyed(){
        return accountCreatedIsDisplayed.isDisplayed();
    }
    public void ClickOnContinueButton(){
        clickOnContinueLocator.click();
    }


}