package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AutoExercisesInfoPage;
import page.AutoExercisesNewUserSignUpPage;
import page.AutoExercisesHomePage;
import page.AutoExercisesInfoPage;
import page.AutoExercisesNewUserSignUpPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoexeStepDefs extends BaseUtil {
    private BaseUtil base;
    public AutoexeStepDefs(BaseUtil base){this.base=base;}

    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.manage().window().maximize();
//        base.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        base.driver.get("https://automationexercise.com/");
    }
    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesHomePage autoExercisesHomePage = new AutoExercisesHomePage(base.driver);
        assertThat(autoExercisesHomePage.IsHomePageVisble(),equalTo(true));


    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesHomePage autoExercisesHomePage = new AutoExercisesHomePage(base.driver);
        autoExercisesHomePage.clickOnSignSignUpButton();
    }
    @Then("I Verify {string} is visible")
    public void i_verify_is_visible(String string) {
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        assertThat(autoExercisesNewUserSignUpPage.IsNewUseSignUpPageVisble(),equalTo(true));
    }
    @Then("I Enter {string} and {string}")
    public void i_enter_and(String Nme, String Email) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        autoExercisesNewUserSignUpPage.EnterName(Nme);
        autoExercisesNewUserSignUpPage.EnterEmail(Email);
    }
    @Then("Click {string} button")
    public void click_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        autoExercisesNewUserSignUpPage.ClickOnSignUpButton();
    }
    @Then("I Verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        assertThat(autoExercisesInfoPage.IsAccountInfoPageVisble(),equalTo(true));
    }
    @When("Fill details: Title, {string} and {string}")
    public void fill_details_title_and(String pWord, String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        autoExercisesInfoPage.clickOnGenderButton();
        autoExercisesInfoPage.enterPassword(pWord);
        autoExercisesInfoPage.enterDayofBirth();
        autoExercisesInfoPage.enterMonthOfBirth();
       autoExercisesInfoPage.enterYearOfBirth();


    }
    @When("Select checkbox {string}")
    public void select_checkbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        autoExercisesInfoPage.clickOnSignUpLettersButton();
        autoExercisesInfoPage.clickOnReceiveOfferButton();
    }
    @When("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String fName, String lName, String coyName, String addre, String countryName, String staNmae, String citNmae, String zipCde, String num) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        autoExercisesInfoPage.enterFirstName(fName);
        autoExercisesInfoPage.enterLastName(lName);
        autoExercisesInfoPage.enterCompanyName(coyName);
        autoExercisesInfoPage.EnterAddress(addre);
        autoExercisesInfoPage.EnterCountryName(countryName);
        autoExercisesInfoPage.EnterStateName(staNmae);
        autoExercisesInfoPage.EnterCityName(citNmae);
        autoExercisesInfoPage.EnterZipCodeNum(zipCde);
        autoExercisesInfoPage.EnterMobileNum(num);
    }
    @When("Click {string}")
    public void click(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        autoExercisesInfoPage.ClickOnCreateAccButton();
    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage = new AutoExercisesInfoPage(base.driver);
        assertThat(autoExercisesInfoPage.AccountCreatedIsDispalyed(),equalTo(true));
    }
    @Then("Click Continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesInfoPage autoExercisesInfoPage= new AutoExercisesInfoPage(base.driver);
        autoExercisesInfoPage.ClickOnContinueButton();

    }

    @And("I Enter correct {string} and {string}")
    public void iEnterCorrectAnd(String eMail, String pWord) {
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        autoExercisesNewUserSignUpPage.EnterEmailAddress(eMail);
        autoExercisesNewUserSignUpPage.EnterPassWord(pWord);

    }

    @And("I Click login button")
    public void iClickLoginButton() {
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        autoExercisesNewUserSignUpPage.ClickOnLoginButton();
    }

    @When("Enter incorrect {string} and {string}")
    public void enter_incorrect_and(String wEmail, String wPWord) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        autoExercisesNewUserSignUpPage.EnterWrongEmailAdd(wEmail);
        autoExercisesNewUserSignUpPage.EnterWrongPassword(wPWord);

    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        AutoExercisesNewUserSignUpPage autoExercisesNewUserSignUpPage = new AutoExercisesNewUserSignUpPage(base.driver);
        assertThat(autoExercisesNewUserSignUpPage.IsWrongEmailandPwordDisplayed(),equalTo(true));
    }
}