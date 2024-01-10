package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoExercisesHomePage extends BasePage{

    public AutoExercisesHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "header")
    private WebElement homePageIsVisible;
    @FindBy(xpath = ".//a[@href='/login']")
    private WebElement signUpLoginLocator;
    @FindBy(xpath = "//b[contains(text(),'sheyi')]")
    private WebElement loginAsUserIsDisplayed;
    @FindBy(xpath = "//a[@href='/contact_us']")
    private WebElement clickOnContactUsLocator;


    public void clickOnSignSignUpButton(){
        signUpLoginLocator.click();

    }
    public boolean IsHomePageVisble(){
        return homePageIsVisible.isDisplayed();

    }
    public void ClickOnContactsUs(){
        clickOnContactUsLocator.click();
    }

}
