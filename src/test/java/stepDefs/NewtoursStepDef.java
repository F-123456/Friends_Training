package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.NewtoursFlightPage;
import page.NewtoursHomePage;
import page.NewtoursRegistrationPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDef extends BaseUtil {
    private BaseUtil base;

    public NewtoursStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Newtours website")
    public void i_am_on_the_newtours_website() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.guru99.com/selenium/newtours/index.php");
    }
    @Then("I Verify that home page is visible")
    public void i_verify_that_home_page_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        assertThat(newtoursHomePage.iSHomePageIsVisible(),equalTo(true));
    }
    @When("I click on the Register link")
    public void i_click_on_the_register_link() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.clickOnRegister();
    }
    @Then("I Verify that {string} page is visible")
    public void i_verify_that_page_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        assertThat(newtoursHomePage.iSRegisterPageDisplayed(),equalTo(true));
    }
    @Then("I populate all the the mandatory field {string},{string},{string},{string},{string},{string},{string},{string}")
    public void i_populate_all_the_the_mandatory_field(String fName, String lName, String eAdd, String pNum, String aDd, String cIty, String sTate, String pCode) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursRegistrationPage newtoursRegistrationPage = new NewtoursRegistrationPage(base.driver);
        newtoursRegistrationPage.enterFirstName(fName);
        newtoursRegistrationPage.enterLastName(lName);
        newtoursRegistrationPage.enterEmailAdd(eAdd);
        newtoursRegistrationPage.enterPhoneNumber(pNum);
        newtoursRegistrationPage.enterAddress(aDd);
        newtoursRegistrationPage.enterCity(cIty);
        newtoursRegistrationPage.enterState(sTate);
        newtoursRegistrationPage.enterPostalCode(pCode);
    }
    @Then("I select {string}")
    public void i_select(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursRegistrationPage newtoursRegistrationPage = new NewtoursRegistrationPage(base.driver);
        newtoursRegistrationPage.selectCountry();
    }
    @Then("I enter {string}, password and confirm as {string}")
    public void i_enter_password_and_confirm_as(String uName, String pWrd) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursRegistrationPage newtoursRegistrationPage = new NewtoursRegistrationPage(base.driver);
        newtoursRegistrationPage.enterUserName(uName);
        newtoursRegistrationPage.enterPassword(pWrd);
        newtoursRegistrationPage.enterConfirmPwrd(pWrd);

    }
    @Then("I click submit button")
    public void i_click_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursRegistrationPage newtoursRegistrationPage = new NewtoursRegistrationPage(base.driver);
        newtoursRegistrationPage.clickOnSubmit();

    }
    @Then("confirmation page is displayed with my {string}")
    public void confirmation_page_is_displayed_with_my(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursRegistrationPage newtoursRegistrationPage = new NewtoursRegistrationPage(base.driver);
        assertThat(newtoursRegistrationPage.iSNoteElementDisplayed(),equalTo(true));
    }




    @When("I click on the Flights link on the left side menu")
    public void i_click_on_the_flights_link_on_the_left_side_menu() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightPage newtoursFlightPage = new NewtoursFlightPage(base.driver);
        newtoursFlightPage.cLickOnFlight();
    }
    @Then("The Flight Finder Page should be displayed")
    public void the_flight_finder_page_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightPage newtoursFlightPage = new NewtoursFlightPage(base.driver);
        assertThat(newtoursFlightPage.iSFlightFinderIsDisplayed(),equalTo(true));

    }
    @Then("{string} Flight details type is selected by default")
    public void flight_details_type_is_selected_by_default(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightPage newtoursFlightPage = new NewtoursFlightPage(base.driver);
        newtoursFlightPage.cLickOnRoundTrip();

    }
    @Then("{string} should be displayed by default for On and returning")
    public void should_be_displayed_by_default_for_on_and_returning(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightPage newtoursFlightPage = new NewtoursFlightPage(base.driver);
        newtoursFlightPage.oNMonth();
        newtoursFlightPage.oNDay();
        newtoursFlightPage.oTMonth();
        newtoursFlightPage.oTDay();

    }
    @Then("{string} should be selected as default for the Service class")
    public void should_be_selected_as_default_for_the_service_class(String string) {
        // Write code here that turns the phrase above into concrete actions
        NewtoursFlightPage newtoursFlightPage = new NewtoursFlightPage(base.driver);
        newtoursFlightPage.eConomy();

    }
}
