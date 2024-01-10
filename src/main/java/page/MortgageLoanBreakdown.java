package page;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageLoanBreakdown extends BasePage {
    public MortgageLoanBreakdown(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "homeval")
    private WebElement HomevalueLocator;
    @FindBy(id = "downpayment")
    private WebElement DownpaymentLocator;
    @FindBy(id = "intrstsrate")
    private WebElement IntrestRateLocator;
    @FindBy(id = "loanterm")
    private WebElement LoanTermLocator;
    @FindBy(xpath = "//select[@name='param[start_month]']")
    private WebElement StartMonthLocator;
    @FindBy(id = "start_year")
    private WebElement StartYearLocator;
    @FindBy (xpath = "//input[@type='submit']")
    private WebElement ClickOnCalculateLocator;
    @FindBy(id="pptytax")
    private WebElement PropertyTaxLocator;
    @FindBy(id="pmi")
    private WebElement PMILocator;
    @FindBy(xpath ="//input[@id='hoi']")
    private WebElement HomeInsLocator;
    @FindBy(xpath = "//input[@id='hoa']")
    private WebElement MonthlyHOALocator;
    @FindBy(xpath = "//Select[@name=\"param[milserve]\"]")
    private WebElement LoanTypeLocator;



    public void EnterHomeValue(String hValue){
        HomevalueLocator.sendKeys(hValue);
    }
    public void EnterDownpayment(String dPayment){
        DownpaymentLocator.sendKeys(dPayment);
    }
    public void EnterInterestRate(String iRate){
        IntrestRateLocator.sendKeys(iRate);
    }
    public void EnterLoanTerm(String lTerm){
        LoanTermLocator.sendKeys(lTerm);
    }
    public void EnterStartMonth(String sMonth){
        StartMonthLocator.sendKeys(sMonth);
    }
    public void EnterStartYear(String sYear){
        StartYearLocator.sendKeys(sYear);
    }
    public void ClickOnCalculatorButton(){
        ClickOnCalculateLocator.click();
    }
    public void EnterPropertyTax(String pTax){
        PropertyTaxLocator.sendKeys(pTax);
    }
    public void EnterPMI(String PMI){
        PMILocator.sendKeys(PMI);
    }
    public void EnterHomeIns(String hIns){
        HomeInsLocator.sendKeys(hIns);
    }
    public void EnterMonthlyHOA(String mHOA){
        MonthlyHOALocator.sendKeys(mHOA);
    }
    public void EnterLoanType(String lType){
        LoanTypeLocator.sendKeys(lType);
    }
}
