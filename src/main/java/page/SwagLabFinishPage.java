package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabFinishPage extends BasePage {
    public SwagLabFinishPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@data-test=\"finish\"]")
    public WebElement clickOnFinish;


    public void ClickOnFinish(){
        clickOnFinish.click();
    }

}