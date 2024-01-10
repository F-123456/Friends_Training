package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursFlightPage extends BasePage {
    public NewtoursFlightPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Flights')]")
    private WebElement ClickOnFlightLocator;

    //    @FindBy(xpath = "//img[@width=\"492\"]")
    @FindBy(xpath = "//img[@src=\"images/mast_flightfinder.gif\"]")
    ////img[@width='492']
    private WebElement FlightFinderIsDisplayed;
    @FindBy(xpath = "//input[@value=\"roundtrip\"]")
    private WebElement RoundTripButton;
    @FindBy(xpath = "//select[@name=\"fromMonth\"]")
    private WebElement OnMonthLocator;
    @FindBy(xpath = "//select[@name=\"fromDay\"]")
    private WebElement OnDayLocator;
    @FindBy(xpath = "//select[@name=\"toMonth\"]")
    private WebElement ToMonthLocator;
    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement ToDayLocator;
    @FindBy(xpath = "//input[@value=\"Coach\"]")
    private WebElement EconomyButton;




    public void cLickOnFlight(){
        ClickOnFlightLocator.click();
    }
    public boolean iSFlightFinderIsDisplayed(){
        return FlightFinderIsDisplayed.isDisplayed();
    }
    public void cLickOnRoundTrip(){
        RoundTripButton.isSelected();
    }
    public void oNMonth(){
        OnMonthLocator.isSelected();
    }
    public void oNDay(){
        OnDayLocator.isSelected();
    }
    public void oTMonth(){
        ToMonthLocator.isSelected();
    }
    public void oTDay(){
        ToDayLocator.isSelected();
    }
    public void eConomy(){
        EconomyButton.isSelected();
    }

}