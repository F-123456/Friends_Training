package stepDefs;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import page.AutoExercisesInfoPage;
import page.AutoExercisesNewUserSignUpPage;
import page.AutoExercisesHomePage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AutoexeStepDefs2 extends BaseUtil {
    private BaseUtil base;

    public AutoexeStepDefs2(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on autoexercise home page")
    public void i_am_on_autoexercise_home_page() {
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        base.driver.get("https://automationexercise.com/");

    }
    @Then("I Verify that home page is visible successfully")
    public void i_verify_that_home_page_is_visible_successfully() {
        assertThat(base.driver.findElement(By.id("header")).isDisplayed(),equalTo(true));

    }
    @Then("Click on Contact Us button")
    public void click_on_contact_us_button() {
        base.driver.findElement(By.xpath("//a[@href='/contact_us']")).click();

    }
    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        assertThat(base.driver.findElement(By.xpath("//h2[contains(text(),'Get In Touch')]")).isDisplayed(),equalTo(true));

    }
    @Then("Enter {string}, {string}, {string} and {string}")
    public void enter_and(String name, String email, String subject, String message) {
        base.driver.findElement(By.xpath("//input[@data-qa='name']")).sendKeys(name);
        base.driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys(email);
        base.driver.findElement(By.xpath("//input[@data-qa='subject']")).sendKeys(subject);
        base.driver.findElement(By.id("message")).sendKeys(message);

    }
    //        SENDKEYS METHOD
    @Then("I click on choose file to upload document")
    public void i_click_on_choose_file_to_upload_document() throws AWTException {
//        base.driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\samod\\Downloads\\OLUWASHEYI_CV.pdf");
//         base.driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\Users\\samod\\Downloads\\OLUWASHEYI_CV.pdf");



//        USING ROBOT CLASS METHODS
        WebElement UploadFile = base.driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor js = (JavascriptExecutor)base.driver;
        js.executeScript("arguments[0].click();",UploadFile);  // CLICK ACTION ON THE BUTTON

//        1] COPY THE PATH
//        2] CTRL + V
//        3] ENTER
        Robot rb = new Robot();
        rb.delay(2000);

//        PUT PATH TO FILE IN A CLIPBOARD
        StringSelection ss = new StringSelection("C:\\Users\\samod\\Downloads\\SAMSON_RESUMEE.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

//        CTROL + V
        rb.keyPress(KeyEvent.VK_CONTROL); // PRESS ON CTRL KEY ON KEYBOARD
        rb.keyPress(KeyEvent.VK_V); // PRESS ON CTRL V KEY ON KEYBORD
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

//        ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
    @Then("Click Submit button")
    public void click_submit_button() {
        base.driver.findElement(By.xpath("//input[@data-qa='submit-button")).click();

    }
    @Then("Click OK button")
    public void click_ok_button() {
        base.driver.switchTo().alert().accept();


    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        assertThat(base.driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed(),equalTo(true));

    }
    @Then("Click Home button")
    public void click_home_button() {
        base.driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
    }


}