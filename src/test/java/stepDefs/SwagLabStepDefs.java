package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.CoreMatchers.is;
public class SwagLabStepDefs extends BaseUtil {
    private BaseUtil base;

    public SwagLabStepDefs(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the swaglab home page")
    public void i_am_on_the_swaglab_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.saucedemo.com/");

    }
    @Then("I Verify that home page is displayed")
    public void i_verify_that_home_page_is_displayed() {
        SwagLabHomePage1 swagLabHomePage1 = new SwagLabHomePage1(base.driver);
        assertThat(swagLabHomePage1.IsSwagLabHomePageVisble(),equalTo(true));

    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage1 swagLabHomePage1 = new SwagLabHomePage1(base.driver);
        swagLabHomePage1.EnterUserName();
        swagLabHomePage1.setEnterPassword();

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabHomePage1 swagLabHomePage1 = new SwagLabHomePage1(base.driver);
        swagLabHomePage1.ClickOnLogInButton();
    }

    @Then("verify that Product page is displayed")
    public void verifyThatProductPageIsDisplayed() {
        SwagLabProductPage swagLabProductPage = new SwagLabProductPage(base.driver);
        assertThat(swagLabProductPage.IsProductPageDisplayed(),equalTo(true));
    }
    @When("I click on the first item on the Products page")
    public void i_click_on_the_first_item_on_the_products_page() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabProductPage swagLabProductPage = new SwagLabProductPage(base.driver);
        swagLabProductPage.ClickOnBackPack();
    }
    @When("I click on Add to cart button")
    public void i_click_on_add_to_cart_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabProductPage swagLabProductPage = new SwagLabProductPage(base.driver);
        swagLabProductPage.ClickOnAddToCart();
    }
    @When("I click on Shopping cart")
    public void i_click_on_shopping_cart() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabProductPage swagLabProductPage = new SwagLabProductPage(base.driver);
        swagLabProductPage.ClickONCart();
    }
    @When("I click on Checkout")
    public void i_click_on_checkout() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabProductPage swagLabProductPage = new SwagLabProductPage(base.driver);
        swagLabProductPage.CLickOnCheckout();
    }
    @When("I complete all the required fields")
    public void i_complete_all_the_required_fields() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        swagLabCheckoutPage.EnterFirstName();
        swagLabCheckoutPage.EnterLastName();
        swagLabCheckoutPage.EnterZipCode();
    }
    @When("I clicked on Continue button")
    public void i_clicked_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        swagLabCheckoutPage.ClickOnContinue();
    }
    @When("I click on Finish button")
    public void i_click_on_finish_button() {
        // Write code here that turns the phrase above into concrete actions
        SwagLabFinishPage swagLabFinishPage = new SwagLabFinishPage(base.driver);
        swagLabFinishPage.ClickOnFinish();
    }
    @Then("{string} message is displayed on the order confirmation page")
    public void message_is_displayed_on_the_order_confirmation_page(String msg) {
        // Write code here that turns the phrase above into concrete actions
        SwagLabCompletePage swagLabCompletePage = new SwagLabCompletePage(base.driver);
        //assertThat(swagLabCompletePage.IsThankYouPageVisble(),equalTo("true"));
        String actualResult = swagLabCompletePage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg),is(true));


    }

    @And("I enter details for only firstname and lastname")
    public void iEnterDetailsForOnlyFirstnameAndLastname() {
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        swagLabCheckoutPage.EnterFirstName();
        swagLabCheckoutPage.EnterLastName();

    }

    @Then("error msg {string} is displayed under Postcode field")
    public void errorMsgIsDisplayedUnderPostcodeField(String arg0) {
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        swagLabCheckoutPage.ClickOnContinue();
    }

    @Then("{string} is displayed under Postcode field")
    public void isDisplayedUnderPostcodeField(String msg) {
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        String actualResult = swagLabCheckoutPage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(msg),is(true));

    }

    @And("I enter details for only lastname and postcode")
    public void iEnterDetailsForOnlyLastnameAndPostcode() {
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        swagLabCheckoutPage.EnterLastName();
        swagLabCheckoutPage.EnterZipCode();
    }

    @Then("error msg {string} is displayed under firstname field")
    public void errorMsgIsDisplayedUnderFirstnameField(String error) {
        SwagLabCheckoutPage swagLabCheckoutPage = new SwagLabCheckoutPage(base.driver);
        String actualResult = swagLabCheckoutPage.getMessage();
        assertThat(actualResult.equalsIgnoreCase(error),is(true));
    }
}
