package page;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExercisesNewUserSignUpPage extends BasePage{

    public AutoExercisesNewUserSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    private WebElement newUserSignupPageIsVisible;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    private WebElement enterNameLocator;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement enterEmailLocator;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement clickOnSignUpLocator;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement enterEmailAddLocator;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement enterPassWordLocator;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement clickOnLoginLocator;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement wrongEmailAddressLocator;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement wrongPasswordLocator;
    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    private WebElement wrongEmailansPWrdIsDisplayed;

    public boolean IsNewUseSignUpPageVisble(){
        return newUserSignupPageIsVisible.isDisplayed();
    }
    public void EnterName(String Nme){
        enterNameLocator.sendKeys(Nme);

    }
    public void EnterEmail(String Email){
        enterEmailLocator.sendKeys(generateRandomEmail());
    }
    private String generateRandomEmail(){
        return RandomStringUtils.random(4, true, true) + "@GMail.com";
    }
    public void ClickOnSignUpButton(){
        clickOnSignUpLocator.click();

    }
    public void EnterEmailAddress(String eMail){
        enterEmailAddLocator.sendKeys(eMail);
    }
    public void EnterPassWord(String pWord){
        enterPassWordLocator.sendKeys(pWord);
    }
    public void ClickOnLoginButton(){
        clickOnLoginLocator.click();
    }
    public void EnterWrongEmailAdd(String wEmail){
        wrongEmailAddressLocator.sendKeys(wEmail);
    }
    public void EnterWrongPassword(String wPWord){
        wrongPasswordLocator.sendKeys(wPWord);
    }
    public boolean IsWrongEmailandPwordDisplayed(){
        return wrongEmailansPWrdIsDisplayed.isDisplayed();
    }


}