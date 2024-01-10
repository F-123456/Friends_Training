package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MortgageLoanBreakdown;
import page.MortgageRepaymentSummary;

import java.util.List;

public class MortgageStepDefs extends BaseUtil {

    private BaseUtil base;

    public MortgageStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Mortgage calculator website")
    public void i_am_on_the_mortgage_calculator_website() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get("https://www.mortgagecalculator.org/");
    }
    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        MortgageLoanBreakdown mortgageLoanBreakdown = new MortgageLoanBreakdown(base.driver);
        mortgageLoanBreakdown.EnterHomeValue(dataTable.get(1).get(1));
        mortgageLoanBreakdown.EnterDownpayment(dataTable.get(2).get(1));
        mortgageLoanBreakdown.EnterInterestRate(dataTable.get(3).get(1));
        mortgageLoanBreakdown.EnterLoanTerm(dataTable.get(4).get(1));
        mortgageLoanBreakdown.EnterStartMonth(dataTable.get(5).get(1));
        mortgageLoanBreakdown.EnterStartYear(dataTable.get(6).get(1));
        mortgageLoanBreakdown.ClickOnCalculatorButton();


    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String string, String string2, String string3, String string4, String string5, String string6) {
        // Write code here that turns the phrase above into concrete actions
        MortgageRepaymentSummary mortgageRepaymentSummary = new MortgageRepaymentSummary(base.driver);
        mortgageRepaymentSummary.GettotalMonthlyPayment();
        mortgageRepaymentSummary.GetdownPaymentAmount();
        mortgageRepaymentSummary.GetdownPaymentPercentage();
        mortgageRepaymentSummary.GetloanPayoffDate();
        mortgageRepaymentSummary.GettotalIntrestPaid();
        mortgageRepaymentSummary.GetmonthlyTaxPaid();
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    @When("I enter the following data")
    public void iEnterTheFollowingData(List<List<String>> dataTable) {
        MortgageLoanBreakdown mortgageLoanBreakdown = new MortgageLoanBreakdown(base.driver);
        mortgageLoanBreakdown.EnterPropertyTax(dataTable.get(1).get(1));
        mortgageLoanBreakdown.EnterPMI(dataTable.get(2).get(1));
        mortgageLoanBreakdown.EnterHomeIns(dataTable.get(3).get(1));
        mortgageLoanBreakdown.EnterMonthlyHOA(dataTable.get(4).get(1));
        mortgageLoanBreakdown.EnterLoanType(dataTable.get(5).get(1));
    }

    @Then("I should get mortgage offer with {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        MortgageRepaymentSummary mortgageRepaymentSummary = new MortgageRepaymentSummary(base.driver);
        mortgageRepaymentSummary.GettotalTaxPaid();
        mortgageRepaymentSummary.GetmonthlyHomeInsurance();
        mortgageRepaymentSummary.GettotalHomeInsurance();
        mortgageRepaymentSummary.GetannualPaymentAmount();
        mortgageRepaymentSummary.Gettotalof360Payments();
    }
}
