package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabHomePage1 extends BasePage {
    public SwagLabHomePage1(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'Swag Labs')]")
    private WebElement swagLabHomePageIsVisible;
    @FindBy(id="user-name")
    private WebElement enterUserName;
    @FindBy(id ="password")
    private WebElement enterPassword;
    @FindBy(id="login-button")
    private WebElement clickOnLogInButton;


    public boolean IsSwagLabHomePageVisble() {
        return swagLabHomePageIsVisible.isDisplayed();

    }
    public void EnterUserName(){
        enterUserName.sendKeys("standard_user");
    }
    public void setEnterPassword(){
        enterPassword.sendKeys("secret_sauce");
    }
    public void ClickOnLogInButton(){
        clickOnLogInButton.click();
    }

}