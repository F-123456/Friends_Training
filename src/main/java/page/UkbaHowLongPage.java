package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UkbaHowLongPage extends BasePage {
    public UkbaHowLongPage(WebDriver driver) {
        super(driver);
    }


    @FindBy( id ="response-1")
    private WebElement clickOnLongerThan6MonthsLocator;


    public void ClickOnLongerThan6Months(){
        clickOnLongerThan6MonthsLocator.click();
    }

}