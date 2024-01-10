package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
public class MortgageRepaymentSummary extends BasePage {
    public MortgageRepaymentSummary(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='repayment-block']/div/div/h3")
    private List<WebElement> RepaymentSummary;


    public String GettotalMonthlyPayment(){
        return RepaymentSummary.get(0).getText();
    }
    public String GetdownPaymentAmount(){
        return RepaymentSummary.get(1).getText();
    }
    public String GetdownPaymentPercentage(){
        return RepaymentSummary.get(3).getText();
    }
    public String GetloanPayoffDate(){
        return RepaymentSummary.get(4).getText();
    }
    public String GettotalIntrestPaid(){
        return RepaymentSummary.get(5).getText();
    }
    public String GetmonthlyTaxPaid(){
        return RepaymentSummary.get(6).getText();
    }
    public String GettotalTaxPaid(){
        return RepaymentSummary.get(7).getText();
    }
    public String GetmonthlyHomeInsurance(){
        return RepaymentSummary.get(8).getText();
    }
    public String GettotalHomeInsurance(){
        return RepaymentSummary.get(9).getText();
    }
    public String GetannualPaymentAmount(){
        return RepaymentSummary.get(10).getText();
    }
    public String Gettotalof360Payments(){
        return RepaymentSummary.get(11).getText();
    }
}