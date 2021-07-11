package StepDefinitions;

import Pages.AmazonRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;

public class AmazonRegistrationStepDef {

    AmazonRegisterPage amazonRegisterPage = new AmazonRegisterPage();

    @Given("TC01_User goes to amazon page")
    public void tc01_user_goes_to_amazon_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("User goes to registration page by clicking the {string} link")
    public void user_goes_to_registration_page_by_clicking_the_link(String string) {
    amazonRegisterPage.HoverOverHelloSignIn();
    amazonRegisterPage.startHere.click();

    }

    @Given("User enters a {string} under Your name")
    public void user_enters_a_under_Your_name(String name) {
    amazonRegisterPage.customerName.sendKeys(ConfigurationReader.getProperty(name));

    }

    @Given("User enters a valid {string} under Email")
    public void user_enters_a_valid_under_Email(String email) {
    amazonRegisterPage.eMail.sendKeys(ConfigurationReader.getProperty(email));

    }

    @Given("User enters a {string} under Password")
    public void user_enters_a_under_Password(String password) {
    amazonRegisterPage.password.sendKeys(ConfigurationReader.getProperty(password));

    }

    @Given("User reenters the {string} Re-enter Password")
    public void user_reenters_the_Re_enter_Password(String password) {

amazonRegisterPage.password_check.sendKeys(ConfigurationReader.getProperty(password));
    }

    @Then("User clicks the Create your Amazon account button")
    public void user_clicks_the_Create_your_Amazon_account_button() {
    amazonRegisterPage.clickCreateButton();

    }

    @Then("verify that the user sees the message {string}")
    public void verify_that_the_user_sees_the_message(String message) {
        String Actual_message = amazonRegisterPage.message.getText();
        Assert.assertEquals(message, Actual_message);


    }





}


