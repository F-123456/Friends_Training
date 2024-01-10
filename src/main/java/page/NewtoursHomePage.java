package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage {
    public NewtoursHomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement HomePageIsVisible;

    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
    private WebElement ClickOnRegisterButton;

    @FindBy(xpath = "//img[@width=\"492\"]")
    private WebElement RegisterPageDisplayed;


    public boolean iSHomePageIsVisible(){
        return HomePageIsVisible.isDisplayed();
    }
    public void clickOnRegister(){
        ClickOnRegisterButton.click();
    }
    public boolean iSRegisterPageDisplayed(){
        return RegisterPageDisplayed.isDisplayed();
    }
}