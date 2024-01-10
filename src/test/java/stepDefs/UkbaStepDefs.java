package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaStepDefs extends BaseUtil {
    private BaseUtil base;

    public UkbaStepDefs(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on UKba Website")
    public void i_am_on_u_kba_website() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();;
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
    }
    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String cName) {
        // Write code here that turns the phrase above into concrete actions
        UkbaNationalityPage ukbaNationalityPage = new UkbaNationalityPage(base.driver);
        ukbaNationalityPage.EnterCountryName(cName);
    }
    @When("I click on Continue button")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        UkbaNationalityPage ukbaNationalityPage = new UkbaNationalityPage(base.driver);
        ukbaNationalityPage.ClickOnContinue();
    }
    @When("I select reason as {string}")
    public void i_select_reason_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        UkbaWhat2DoPage ukbaWhat2DoPage = new UkbaWhat2DoPage(base.driver);
        ukbaWhat2DoPage.ClickOnStudyButton();
    }
    @When("I state I intend to stay for more than {int} months")
    public void i_state_i_intend_to_stay_for_more_than_months(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        UkbaHowLongPage ukbaHowLongPage = new UkbaHowLongPage(base.driver);
        ukbaHowLongPage.ClickOnLongerThan6Months();
    }
    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String string) {
        // Write code here that turns the phrase above into concrete actions
        UkbaConfirmationPage ukbaConfirmationPage = new UkbaConfirmationPage(base.driver);
        assertThat(ukbaConfirmationPage.YouNeedaVisaToStudyIsDIsplayed(),equalTo(true));
    }
/////////////////////////////////////////

    @Given("I select the reason as {string}")
    public void i_select_the_reason_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        UkbaWhat2DoPage ukbaWhat2DoPage = new UkbaWhat2DoPage(base.driver);
        ukbaWhat2DoPage.ClickOnTourismButton();
    }
    @Given("I select {string} button for travelling with or visiting partner or family member")
    public void i_select_button_for_travelling_with_or_visiting_partner_or_family_member(String string) {
        // Write code here that turns the phrase above into concrete actions
        UkbaTravellingWithOrWithoutPage ukbaTravellingWithOrWithoutPage = new UkbaTravellingWithOrWithoutPage(base.driver);
        ukbaTravellingWithOrWithoutPage.ClickOnVistingPartner();
    }
    @Then("I will be informed {string}")
    public void i_will_be_informed(String string) {
        // Write code here that turns the phrase above into concrete actions
        UkbaConfirmationPage ukbaConfirmationPage = new UkbaConfirmationPage(base.driver);
        assertThat(ukbaConfirmationPage.YouNeedAVisaDisplayed(),equalTo(true));

    }

}